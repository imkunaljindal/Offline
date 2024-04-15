import java.util.Scanner;

public class BoundaryTraversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        boundaryTraversal(m, n, matrix);
        sc.close();
    }

    public static void boundaryTraversal(int m, int n, int[][] matrix) {

        if(m==1){
            for(int j=0;j<m;j++){
                System.out.print(matrix[0][j] + " ");
            }
        }
        else if(n==1){
            for(int i=0;i<m;i++) {
                System.out.print(matrix[i][0]);
            }
        }
        else{
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[0][j] + " ");
            }
            for (int i = 1; i < n; i++) {
                System.out.print(matrix[i][m - 1] + " ");
            }
            for (int j = m - 2; j >= 0; j--) {
                System.out.print(matrix[n - 1][j] + " ");
            }
            for (int i = n - 2; i >= 1; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }


    }
}