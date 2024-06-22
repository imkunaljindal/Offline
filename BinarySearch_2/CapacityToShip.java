import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    public static boolean isPossible(int A[], long shipWeight, int days) {
        long daysNeeded = 1;
        long weightCarried = 0;
        for(int i=0;i<A.length;i++) {
            if(weightCarried + A[i] <= shipWeight) {
                weightCarried += A[i];
            }
            else {
                daysNeeded++;
                weightCarried = A[i];
            }
        }
        return (daysNeeded > days) ? false: true;
    }

    public static long solve(int[] A, int B) {
        long totalWeight = 0;
        long maxWeight = 0;
        for(int x: A) {
            maxWeight = Math.max(maxWeight,x);
            totalWeight += x;
        }

        if(B>=A.length) return maxWeight;  // base condition
        long s = 0;
        long e = totalWeight;
        long ans = -1;
        while(s<=e) {
            long mid = s + (e-s)/2;
            if(isPossible(A,mid,B)) {
                ans = mid;
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return ans;
    }
}

class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(Solution.solve(A,B));
    }
}