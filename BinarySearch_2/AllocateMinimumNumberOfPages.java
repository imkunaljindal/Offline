import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {

    public boolean isPossible(int arr[], int m, long maxPages) {
        long students = 1;
        long pages = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(pages + arr[i] <= maxPages) {
                pages += arr[i];
            }
            else {
                students++;
                pages = arr[i];
            }
        }
//        if(students <= m) return true;
//        return false;
        return (students > m || pages > maxPages) ? false:true;
    }

    public long MinimumPages(int[] A, int B) {
        //min
        if(B>A.length) return -1;
        long sum = 0;
        for(int x: A) {
            sum += x;
        }
        // binary
        long s = A[0];
        long e = sum;
        long ans = e;
        while(s<=e) {
            long mid = s + (e-s)/2;
            if(isPossible(A,B,mid)) {
                ans = mid;
                e = mid-1;
            }
            else s = mid+1;
        }
        return ans;

    }
}

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++)
            A[i] = sc.nextInt();

        Solution Obj = new Solution();
        System.out.println(Obj.MinimumPages(A,B));
    }
}