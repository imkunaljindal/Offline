import java.util.*;

public class StringEncodings {
    static void helper(String str, int i, String curr) {
        if(i==str.length()) {
            System.out.println(curr);
            return;
        }

        // one digit
        int oneDigit = str.charAt(i) - '0';
        if(oneDigit==0) {
            return;
        }
        if(oneDigit > 0) {
            helper(str,i+1, curr + (char)('a' + oneDigit-1));
        }

        // two digit
        if(i==str.length()-1) {
            return;
        }
        int twoDigitNumber = Integer.parseInt(str.substring(i,i+2));
        if(twoDigitNumber <= 26) {
            helper(str,i+2,curr + (char)('a' + twoDigitNumber - 1));
        }
    }

    public static void printEncodings(String str) {
        // Write your code here
        helper(str,0,"");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str);
    }
}