import java.io.*;
import java.util.*;

public class StockSpanProblem {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution2 s  = new Solution2();
        int ans[] = s.stockSpan(a);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

class Solution2 {
    static int[] nextLargerElementOnLeft(int a[]) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[a.length];

        for(int i=0;i<a.length;i++) {
            int currEle = a[i];
            while(st.size()>0 && a[st.peek()] <= currEle) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i] = -1;
            }
            else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }

    static int[] stockSpan(int[] a) {
        int[] nextlargerOnLeftIndex = nextLargerElementOnLeft(a);
        int[] ans = new int[a.length];

        for(int i=0;i<nextlargerOnLeftIndex.length;i++) {
            ans[i] = i - nextlargerOnLeftIndex[i];
        }
        return ans;
    }
}