import java.util.Scanner;

public class Concept {

    static void printArray(int arr[], int i) {

        if(i==arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        printArray(arr,i+1);
    }

    public static void main(String[] args) {

        // array input and print
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        printArray(arr,0);
//        for(int i=0;i<n;i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
