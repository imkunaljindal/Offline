public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {13,17,2,5,11,17};
        int n = arr.length;

        for(int i=0;i<n;i++){
            int idx = i;  // mana hai ki ith index is the smallest element
            for(int j=i+1;j<n;j++){  // bache hue array se sabse chhota element dhoondha
                if(arr[j] <arr[idx]) {  // sign change for increasing/decreasing
                    idx = j;
                }
            }
            // swap arr[minIdx] and arr[i]
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
