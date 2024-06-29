import java.util.*;

public class EquilibriumIndex {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = Solution1.findEquilibriumIndex(a);
        System.out.println(ans);
    }
}

class Solution1 {
    static int findEquilibriumIndex(int[] a) {
        int totalSum = 0;
        // pre computation step
        for(int ele: a) {
            totalSum += ele;
        }

        int lSum = 0;
        for(int i=0;i<a.length;i++) {
            int rSum = totalSum - lSum - a[i];
            if(lSum==rSum) return i;
            lSum += a[i];
        }
        return -1;
    }
}