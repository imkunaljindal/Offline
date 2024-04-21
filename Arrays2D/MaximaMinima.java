import java.util.*;

public class MaximaMinima {
    public static int maximaMinima(int[][] mat) {
        //Write code here
        int n = mat.length;
        int ans = -1;

        int rowMin[] = new int[n];
        int colMax[] = new int[n];

        for(int i=0;i<n;i++){
            int mn = Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(mat[i][j] < mn){
                    mn = mat[i][j];
                }
            }
            rowMin[i] = mn;
        }

        for(int j=0;j<n;j++){
            int mx = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(mat[i][j] > mx){
                    mx = mat[i][j];
                }
            }
            colMax[j] = mx;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==rowMin[i] && mat[i][j]==colMax[j]){
                    ans = mat[i][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima(matrix);
        System.out.println(result);
        sc.close();
    }
}