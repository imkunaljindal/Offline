import java.util.*;

public class ToggleCase {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        toggleCase(n, str);
    }

    static void toggleCase(int n, String str) {
        // your code here
        for(int i=0;i<n;i++){
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z') {
                char x = (char)(c-'a'+'A');
                System.out.print(x);
            }
            else if(c >= 'A' && c <= 'Z') {
                char x = (char)(c-'A' + 'a');
                System.out.print(x);
            }
            else {
                System.out.print(c);
            }
        }
    }
}