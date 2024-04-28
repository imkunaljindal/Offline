public class PrintNumbersInReverse {
    static void printInReverse(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printInReverse(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        printInReverse(n);
    }
}
