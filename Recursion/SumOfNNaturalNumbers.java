public class SumOfNNaturalNumbers {

    static int sum(int n){
        if(n==0){
            return 0;
        }
        int smallerSum = sum(n-1);
        return n + smallerSum;
    }
    public static void main(String[] args) {

        int n = 10;
    }
}
