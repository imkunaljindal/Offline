import java.util.Scanner;

public class MergeSort {

    static void merge(int arr[], int s, int e) {
        int mid = (s+e)/2;
        int i = s;  // left half start
        int j = mid+1; // right half start
        int k = 0;

        int temp[] = new int[e-s+1];
        while(i<=mid && j<=e) {
            if(arr[i] > arr[j]) {
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }

        //left half remaining elements
        while(i<=mid) {
            temp[k++] = arr[i++];
        }
        //right half remaining elements
        while(j<=e) {
            temp[k++] = arr[j++];
        }

        // overwrite in the original array
        k = 0;
        for(int x=s;x<=e;x++) {
            arr[x] = temp[k++];
        }
    }

    static void mergeSort(int arr[], int s, int e) {
        if(s>=e) return;

        int mid = (s+e)/2;
        mergeSort(arr,s,mid); //left half
        mergeSort(arr,mid+1,e); //right half
        merge(arr,s,e);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,n-1);

        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
