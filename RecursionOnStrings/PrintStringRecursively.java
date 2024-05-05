import java.util.Scanner;

public class PrintStringRecursively {

    static void printNormal(String str, int n) {
        if(n==0) {
            return;
        }
        printNormal(str,n-1);
        System.out.println(str.charAt(n-1));
    }

    static void printReverse(String str, int n) {
        if(n==0) {
            return;
        }
        System.out.println(str.charAt(n-1));
        printReverse(str,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        printNormal(str, str.length());
        System.out.println("Printing in reverse order");
        printReverse(str,str.length());
    }
}
