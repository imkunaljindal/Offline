import java.util.ArrayList;
import java.util.Scanner;

public class Concept {

//    static void printRecursively(int n) {
//        if(n==0) return;
//        printRecursively(n-1);
//        System.out.println(n);
//    }

    static void helper(int n, ArrayList<Integer> ans) {
        if(n==0) {
            return;
        }
        helper(n-1,ans);
        ans.add(n);
    }
    static ArrayList<Integer> addNumbersRecursively(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(n,ans);
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
//        printRecursively(n);
        ArrayList<Integer> ans = addNumbersRecursively(n);
        System.out.println(ans);
    }
}
