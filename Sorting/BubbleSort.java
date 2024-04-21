public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {13,17,2,5,11,9};
        int n = arr.length;

        for(int i=0;i<n;i++){
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {  // decreasing ke liye sign reverse krdein
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // when array is already, there will be no swaps
            if(swapped == false){
                break;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
