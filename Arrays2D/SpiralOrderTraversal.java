import java.util.Scanner;

public class SpiralOrderTraversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int rowStart = 0;
        int rowEnd = r-1;
        int colStart = 0;
        int colEnd = c-1;

        while((rowStart <= rowEnd) && (colStart <= colEnd)) {
            // blue
            for(int i=colStart; i<= colEnd; i++){
                System.out.print(arr[rowStart][i] + " ");
            }
            rowStart++;
            //green
            for(int i=rowStart; i<= rowEnd; i++){
                System.out.print(arr[i][colEnd]+ " ");
            }
            colEnd--;
            //red
            if(rowStart < rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(arr[rowEnd][i] + " ");
                }
            }
            rowEnd--;
            //pink
            if(colStart < colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(arr[i][colStart] + " ");
                }
            }
            colStart++;
        }
    }
}