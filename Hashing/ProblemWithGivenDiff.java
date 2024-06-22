import java.io.*;
import java.util.*;

class Solution2 {
    public int givenDifference(int []A, int n, int B) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            if(set.contains(A[i] - B) || set.contains(A[i] + B)) {
                return 1;
            }
            set.add(A[i]);
        }
        return 0;
    }
}

public class ProblemWithGivenDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,B;
        n = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        B = sc.nextInt();
        Solution2 Obj = new Solution2();
        System.out.println(Obj.givenDifference(mat,n,B));
        System.out.println('\n');
    }
}
