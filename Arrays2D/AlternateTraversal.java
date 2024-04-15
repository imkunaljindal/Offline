import java.util.*;

class Solution {
    public void printElementsAlternately(int[][] mat,int m,int n) {
        //Write code here and print output
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    System.out.print(mat[i][j]+ " ");
                }
            }
            else{
                for(int j=m-1;j>=0;j--){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}

public class AlternateTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printElementsAlternately(mat,m,n);

        sc.close();
    }
}
