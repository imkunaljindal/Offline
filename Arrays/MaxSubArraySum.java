import java.util.*;

public class MaxSubArraySum {

    public static int maxSubarraySum(int[] nums) {
        // write your code here
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        // O(n^2)
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++) {
                sum += nums[j];
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        if(n == 0) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = maxSubarraySum(nums);
        System.out.println(result);
    }
}