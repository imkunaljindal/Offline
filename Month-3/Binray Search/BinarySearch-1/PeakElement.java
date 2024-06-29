import java.io.*;
import java.util.*;

class PeakElement {
    public int peakIndexInMountainArray(int[] A) {
        // Your code here.
        int s = 0;
        int e = A.length-1;
        while(s<=e) {
            int mid = s + (e-s)/2;
            if(A[mid] > A[mid-1]) {
                s = mid+1;
            }
            else e = mid-1;
        }
        return s;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.peakIndexInMountainArray(arr1);
        System.out.print(result + " ");
        System.out.println('\n');
    }
}