import java.util.*;
import java.lang.*;
import java.io.*;

class Solution1
{
    // T.C -> O(n) and S.C -> O(n)
    public static long[] nextLargerElement(long[] arr, int n)
    {
        Stack<Long> st = new Stack<>();
        long ans[] = new long[n];

        for(int i=n-1;i>=0;i--) {
            long currEle = arr[i];
            while(st.size() > 0 && st.peek()<=currEle) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i] = -1;
            }
            else {
                ans[i] = st.peek();
            }
            st.push(currEle);
        }
        return ans;
    }
}
class NextGreaterElement {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        long[] res = new Solution1().nextLargerElement(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(res[i] + " ");
        System.out.println();
    }
}