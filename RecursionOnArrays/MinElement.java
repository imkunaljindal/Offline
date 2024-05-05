import java.util.Scanner;

public class MinElement {

    static int findMin(int arr[], int i) {
        if(i==arr.length-1) {
            return arr[i];
        }
        int currElement = arr[i];
        int restOfTheMin = findMin(arr,i+1);
        return Math.min(currElement,restOfTheMin);
    }

    static void solve(int n) {
        if(n==0) return;
        solve(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }

//        int minElement = arr[0];
//        for(int i=1;i<n;i++){
//            if(arr[i] < minElement) {
//                minElement = arr[i];
//            }
//        }

//        System.out.println(minElement);
//        System.out.println(findMin(arr,0));
        solve(37000);
    }

}
