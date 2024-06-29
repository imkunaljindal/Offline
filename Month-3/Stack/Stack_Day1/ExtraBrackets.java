import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public boolean ExtraBrackets(String exp) {

        // T.C -> O(n) and S.C -> O(n)
        Stack<Character> st = new Stack<>();
        for(char c: exp.toCharArray()) {
            if(c==')') {
                if(st.peek()=='(') {
                    return true;
                }
                while(st.size() > 0 && st.peek()!='(') {
                    st.pop();
                }
                st.pop(); // remove the opening bracket

            }
            else{
                st.push(c);
            }
        }
        return false; // no extra bracket
    }
}

public class ExtraBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Solution Obj = new Solution();
        if(Obj.ExtraBrackets(exp))
            System.out.println("true");
        else
            System.out.println("false");
    }
}