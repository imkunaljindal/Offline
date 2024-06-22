import java.io.*;
import java.util.*;

class Solution {
    public void firstElementToOccurKTimes(int[] nums, int n, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i=0;i<n;i++) {
            if(freqMap.containsKey(nums[i])) {
                int currFreq = freqMap.get(nums[i]);
                freqMap.put(nums[i],currFreq+1);
            }
            else {
                freqMap.put(nums[i],1);
            }
            if(freqMap.get(nums[i])==k) {
                System.out.println(nums[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}

public class FirstToOccurKTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        Obj.firstElementToOccurKTimes(nums,n,k);
        System.out.println();
    }
}