import java.io.*;
import java.util.*;
import java.util.*;

class Solution {

    public static boolean isPossible(int a[], int cows, int maxDist) {
        int cowsPlaced = 1;
        int pos = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] - pos > maxDist) {
                cowsPlaced++;
                pos = a[i];
            }
        }
        if (cowsPlaced >= cows) return true;
        return false;
    }

    public static int aggressiveCows(int a[], int cows) {
        Arrays.sort(a);
        int n = a.length;
        int maxDist = a[n - 1] - a[0];
        int s = 0;
        int e = maxDist;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossible(a, cows, mid)) {
                ans = mid;
                s = mid + 1;
            } else e = mid - 1;
        }
        return ans;
    }

    class AggresiveCows {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            System.out.println(obj.aggressiveCows(nums, k));

        }
    }
}
