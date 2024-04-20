import java.util.*;
import java.io.*;

public class Pangrams {
    public  static void isPangram(String s)
    {
        // Your code here
        boolean isPresent[] = new boolean[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                int idx = c - 'a';
                isPresent[idx] = true;
            }
            else if(c >='A' && c<='Z'){
                int idx = c - 'A';
                isPresent[idx] = true;
            }
        }

        for(int i=0;i<26;i++){
            if(isPresent[i] == false) {
                System.out.println("not pangram");
                return;
            }
        }

        System.out.println("pangram");
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);

    }
}