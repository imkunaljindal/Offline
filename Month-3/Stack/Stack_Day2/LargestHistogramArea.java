import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        System.out.println(new Solution4().maximumArea(arr, n));
    }
}

class Solution4 {
    public static long maximumArea(long hist[], long n) {

        long[] nextSmallerLeftIndex = nextSmallerElementOnLeftIndex(hist,(int)n);
        long[] nextSmallerRightIndex = nextSmallerElementOnRightIndex(hist,(int)n);

        long ans = 0;
        for(int i=0;i<n;i++) {
            long width = (nextSmallerRightIndex[i] - nextSmallerLeftIndex[i] - 1);
            long height = hist[i];
            ans = Math.max(ans,height*width);
        }

        return ans;
    }

    private static long[] nextSmallerElementOnLeftIndex(long[] hist, int n) {
        Stack<Integer> st = new Stack<>();
        long ans[] = new long[n];

        for(int i=0;i<n;i++) {
            long currEle = hist[i];
            while(st.size()> 0 && hist[st.peek()] >= currEle) {
                st.pop();
            }

            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }

    private static long[] nextSmallerElementOnRightIndex(long[] hist, int n) {
        Stack<Integer> st = new Stack<>();
        long ans[] = new long[n];
        for(int i=n-1;i>=0;i--) {
            long currEle = hist[i];
            while(st.size() > 0 && hist[st.peek()] >= currEle) {
                st.pop();
            }

            if(st.isEmpty()) ans[i] = n;
            else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
}