import java.util.Scanner;

public class BinarySearchIterative {

    public static int binarySearch(int arr[], int n, int K) {
        int s = 0;
        int e = n-1;
        while(s<=e) {
            int mid = (s+e)/2;
            if(arr[mid]==K) {
                return mid;
            }
            if(arr[mid] > K) {
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return -1; // element not present
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int K = sc.nextInt(); // element to be searched

        System.out.println(binarySearch(arr,n,K));
    }
}
