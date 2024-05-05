import java.io.*;
import java.util.*;
public class RecursiveMultiply {
    public static long multiplyRecursively(int n, int m) {
        //Write code here and print output
        if(m==0){
            return 0;
        }

        long smallerAns = multiplyRecursively(n,m-1);
        return n + smallerAns;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(multiplyRecursively(n, m));
    }
}