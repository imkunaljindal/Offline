import java.util.Scanner;

public class BinarySearchIterative {

    public static int binarySearch(int arr[], int K) {
        int s = 0;
        int e = arr.length-1;
        while(s<=e) {
           int mid = s + (e-s)/2;
           if(arr[mid]==K) {
               return mid;
           }
           if(arr[mid] > K) {
               e = mid-1;
           }
           else{
               s = mid+1;
           }
        }

        System.out.println("Value of s = "+s);
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of the array
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int K = sc.nextInt(); // element to be searched

        System.out.println(binarySearch(arr,K));
    }
}
