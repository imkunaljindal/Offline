import java.util.*;
public class Concepts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int [][]nums = new int[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                nums[i][j] = sc.nextInt();
//            }
//        }

        // row wise traversal
//        int sum = 0;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                sum += nums[i][j];
//            }
//        }
//        System.out.println(sum);

        // column wise traversal
//        for(int col=0;col<m;col++){
//            for(int row=0;row<n;row++){
//                System.out.print(nums[row][col] + " ");
//            }
//        }

        //  print elements for first row of a N x M matrix
//        for(int j=0;j<m;j++){
//            System.out.print(nums[0][j] + " ");
//        }

        // print elements of first column of a N x M matrix
//        for(int i=0;i<n;i++){
//            System.out.print(nums[i][0] + " ");
//        }

        // print all elements of last row of N x M matrix
//        for(int j=0;j<m;j++){
//            System.out.print(nums[n-1][j] + " ");
//        }

        // print all elements of last column
//        for(int i=0;i<n;i++){
//            System.out.print(nums[i][m-1] + " ");
//        }

        // print the transpose of N x M matrix/ col wise printing
//        for(int j=0;j<m;j++){
//            for(int i=0;i<n;i++){
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }

        // store the transpose of a n X m
//        int transpose[][] = new int[m][n];

//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                transpose[j][i] = nums[i][j];
//            }
//        }

//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(transpose[i][j] + " ");
//            }
//            System.out.println();
//       }
//        int arr[] = {1,2,3};

        int a[][] = {{1,2,3},
                {4,5,6},
                {6,7,8}};
        System.out.print(a);
    }


}