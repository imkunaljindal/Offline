import java.util.Scanner;

public class Concepts2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        /**
         * Sum of every row in N x M matrix
         * This is a multiline comment
         */
//        for(int i=0;i<n;i++){
//            int sum = 0;
//            for(int j=0;j<m;j++){
//                sum += arr[i][j];
//            }
//            System.out.println(sum);
//        }

        /**
         * Sum of each column
         */
//        for(int j=0;j<m;j++){
//            int sum = 0;
//            for(int i=0;i<n;i++){
//                sum += arr[i][j];
//            }
//            System.out.println(sum);
//        }

        // print the transpose (doosra naam - columnwise printing)
//        for(int j=0;j<m;j++){
//            for(int i=0;i<n;i++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        // actually make a transpose matrix in memory N x M
        int transpose[][] = new int[m][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                transpose[j][i] = arr[i][j];
            }
        }


    }
}