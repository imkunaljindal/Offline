import java.util.Scanner;

public class BinarySearchRecursive {

    public static int helper(int arr[], int s, int e, int K) {
        if(s>e) return -1;  // base case
        int mid = s + (e-s)/2;
        if(arr[mid]==K) return mid;

        if(arr[mid] > K) {
            return helper(arr,s,mid-1,K);
        }
        return helper(arr,mid+1,e,K);
    }

    public static int binarySearch(int arr[], int K) {
        return helper(arr,0,arr.length-1,K);
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
