import java.util.*;

public class ArraySub {

    public static int[] calc(int []large, int []small) {
        int n = large.length;
        int m = small.length;
        int ans[] = new int[n];

        int i = n-1;
        int j = m-1;
        int k = n-1;

        while(j >= 0) {
            int diff;
            if(large[i] > small[j]) {
                diff = large[i] - small[j];
            }
            else {
                large[i] = 10 + large[i];
                large[i-1] -= 1;
                diff = large[i] - small[j];
            }
            ans[k] = diff;
            i--;
            j--;
            k--;
        }
        while(i>=0) {
            ans[k] = large[i];
            k--;
            i--;
        }
        return ans;

    }

    static int[] subtract(int[] n1, int[] n2) {
        // your code here
        if(n1.length > n2.length) {
            return calc(n1,n2);
        }
        else if(n2.length > n1.length) {
            return calc(n2,n1);
        }
        else{
            for(int i=0;i<n1.length;i++) {
                if(n1[i] > n2[i]) {
                    return calc(n1,n2);
                }
            }
            return calc(n2,n1);
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        sc.close();

        int[] res = subtract(arr1, arr2);
        for (int i : res) System.out.println(i);
    }
}