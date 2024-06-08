import java.util.Scanner;

public class TernaryOperatorConcept {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int ans = (x%2==0) ? x*x*x : x*x;
        System.out.println(ans);
    }
}
