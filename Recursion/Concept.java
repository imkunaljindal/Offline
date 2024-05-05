public class Concept {

    static int factorial(int n) {  //n == 23
        if(n==0){
            return 1;
        }
        int smallerAns = factorial(n-1);  // 22!
        return n*smallerAns;
    }

    static void printXY(int x, int y){
        if(x==y){
            System.out.println(x + " ");
            return;
        }
        System.out.println(x + " ");
        printXY(x+1,y);
    }

    public static void main(String[] args) {
        // write a program to find N!
//        int ans = 1;
//        int n = 5;
//        for(int i=1;i<=n;i++) {
//            ans *= i;
//        }
//        System.out.println(ans);

//        System.out.println(factorial(5));
        printXY(48,4880);
    }
}
