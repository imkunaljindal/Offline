import java.util.*;

public class Concept {

    public static void main(String[] args) {
//        int arr[] = {15,13,9,7,20,16};
//        Arrays.sort(arr);  // increasing default
//
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            arrayList.add(x);
        }

        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);


    }
}
