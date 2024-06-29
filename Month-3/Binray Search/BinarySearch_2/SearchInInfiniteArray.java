

public class SearchInInfiniteArray {

    // O(logN + logN) -> O(logN)
    public static int search(int A[], int val) {
        int s = 0;
        int e = 1;
        while(A[e] < val) {
            s = e;
            e = e*2;
        }
        return binarySearch(A,val,s,e);
    }
    public static void main(String[] args) {

    }
}
