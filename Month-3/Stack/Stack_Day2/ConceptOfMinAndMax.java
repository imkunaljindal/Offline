public class ConceptOfMinAndMax {

    public static void main(String[] args) {
        int arr[] =  {5,3,2,1,8,9,0};
        int n = arr.length;
        int lMin[] =  new int[arr.length];

        lMin[0] = arr[0];
        for(int i=1;i<arr.length;i++) {
            lMin[i] = Math.min(lMin[i-1],arr[i]);
        }

        int rMin[] = new int[arr.length];
        rMin[n-1] = arr[n-1];

        for(int i=n-2;i>=0;i--) {
            rMin[i] = Math.min(rMin[i+1],arr[i]);
        }

        for(int i=0;i<lMin.length;i++) {
            System.out.print(lMin[i] +" ");
        }

        for(int i=0;i<lMin.length;i++) {
            System.out.print(rMin[i] +" ");
        }
    }
}
