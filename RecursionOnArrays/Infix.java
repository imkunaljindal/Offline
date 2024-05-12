import java.io.*;
import java.util.*;

public class Infix {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Solution ob =new Solution();
        ob.evaluate(exp);
    }
}

class Solution{
    public void evaluate(String exp){
        Stack<Character> operators = new Stack<>();
        Stack<Integer> operands = new Stack<>();

        for(int i=0;i<exp.length();i++) {
            char ch = exp.charAt(i);
            if(ch=='(') {
                operators.push(ch);
            }
            else if(Character.isDigit(ch)) {
                operands.push(ch-'0');
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {
                while (operators.size() > 0 && operators.peek() != '('
                && precedence(ch) <= precedence(operators.peek())) {
                    int val2 = operands.pop();
                    int val1 = operands.pop();
                    char op = operators.pop();
                    int result = evaluate(val1,val2,op);
                    operands.push(result);
                }
                operators.push(ch);
            }
            else if(ch == ')') {
                while (operators.size() > 0 && operators.peek() != '(') {
                    int val2 = operands.pop();
                    int val1 = operands.pop();
                    char op = operators.pop();
                    int result = evaluate(val1,val2,op);
                    operands.push(result);
                }
                if (operators.size() > 0) {
                    operators.pop();
                }
            }
        }

        while(operators.size() > 0) {
            char ch = operators.pop();
            int val2 = operands.pop();
            int val1 = operands.pop();
            int result = evaluate(val1,val2,ch);
            operands.push(result);
        }

        System.out.print(operands.peek());

    }

    static int evaluate(int op1, int op2, char operator) {
        if(operator == '+') return op1+op2;
        if(operator == '-') return op1-op2;
        if(operator == '*') return op1*op2;
        return op1/op2;
    }
    static int precedence(char ch) {
        if(ch=='+' || ch=='-') return 1;
        return 2;
    }
}               