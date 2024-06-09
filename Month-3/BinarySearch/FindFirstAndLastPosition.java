import java.util.*;

public class FindFirstAndLastPosition {
    public static int findFirstPos(int arr[], int n, int k) {
        int s = 0;
        int e = n-1;
        int firstPos = -1;
        while(s<=e) {
            int mid = s + (e-s)/2;
            if(arr[mid]==k) {
                firstPos = mid;
                e = mid-1;
            }
            else if(arr[mid] > k) {
                e = mid-1;
            }
            else s = mid+1;
        }
        return firstPos;
    }

    public static int findLastPos(int arr[], int n, int k) {
        int s = 0;
        int e = n-1;
        int lastPos = -1;
        while(s<=e) {
            int mid = s + (e-s)/2;
            if(arr[mid]==k) {
                lastPos = mid;
                s = mid+1;
            }
            else if(arr[mid] > k) {
                e = mid-1;
            }
            else s = mid+1;
        }
        return lastPos;
    }

    public static void findPosition(int a[], int n,int k)
    {
        System.out.print(findFirstPos(a,n,k) + " " + findLastPos(a,n,k));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        findPosition(array,n,k);
    }
}