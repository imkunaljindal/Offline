import java.util.*;

class Solution{

    public static void sortCol(int[][] mat, int N, int M) {
        // Write your code and print here

        for (int j = 0; j < M; j++) {
            for (int k = 0; k < N; k++) {
                for (int i = 0; i < N - 1; i++) {
                    // current column -> j
                    if (mat[i][j] > mat[i + 1][j]) {
                        int temp = mat[i][j];
                        mat[i][j] = mat[i + 1][j];
                        mat[i + 1][j] = temp;
                    }
                }
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class AsSorting1 {
    public static void main(String[] args) throws Throwable {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] mat =new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        Solution.sortCol(mat, n, m);

    }
}