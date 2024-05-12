import java.util.Scanner;

public class QuickSort {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int arr[], int s, int e) {
        int pivot = arr[e];
        int i = s-1;
        for(int j=s;j<=e-1;j++) {
            if(arr[j] >= pivot) {
                i++;
                swap(arr,i,j);
            }
        }

        swap(arr,i+1,e);
        return i+1;
    }

    static void quickSort(int arr[], int s, int e) {
        if(s>=e) return;
        int p = partition(arr,s,e);
        quickSort(arr,s,p-1);
        quickSort(arr,p+1,e);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr,0,n-1);

        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
