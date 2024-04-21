import java.util.*;

public class FindTheWay {
    public static int[] findTheWay(int[][] matrix) {
        //Write code here
        int r = 0;
        int c = 0;
        int n = matrix.length;
        int m = matrix[0].length;

        // East -> 0
        // South -> 1
        //West -> 2
        // North -> 3
        int dir = 0;
        int prevRow = 0;
        int prevCol = 0;
        while(r>=0 && r<=n-1 && c>=0 && c<=m-1){
            prevRow = r;
            prevCol = c;
            if(matrix[r][c]==0){
                // same direction
                if(dir==0){
                    c++;
                }
                else if(dir==1){
                    r++;
                }
                else if(dir==2){
                    c--;
                }
                else{
                    r--;
                }
            }
            else{
                //diff direction
                if(dir==0){
                    dir = 1;
                    r++;
                }
                else if(dir==1){
                    dir = 2;
                    c--;
                }
                else if(dir==2){
                    dir = 3;
                    r--;
                }
                else {
                    dir = 0;
                    c++;
                }
            }
        }

        int ans[] = new int[2];
        ans[0] = prevRow;
        ans[1] = prevCol;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        }
        int result[] = findTheWay(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}