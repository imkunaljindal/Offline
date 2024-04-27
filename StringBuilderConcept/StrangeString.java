import java.io.*;
import java.util.*;

public class StrangeString {
    static String strangeString(int n) {
        StringBuilder ans = new StringBuilder();
        char c = 'a';
//        char c = 'a';
        for(int i=0;i<n;i++){
            int count = i%26 + 'a';
            if(i%2==0){
                ans.insert(0,(char)count);
            }
            else {
                ans.append((char)count);
            }
//            c++;
//            if(c > 'z'){
//                c = 'a';
//            }
        }
        return ans.toString();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0){
            int n = input.nextInt();
            System.out.println(strangeString(n));
        }
    }
}