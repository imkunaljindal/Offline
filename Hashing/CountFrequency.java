import java.util.HashMap;
import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<10;i++) {
            arr[i] = sc.nextInt();
        }

        // element,freq
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i=0;i<10;i++) {
            if(freqMap.containsKey(arr[i])) {
                int currFreq = freqMap.get(arr[i]);
                freqMap.put(arr[i],currFreq+1);
            }
            else {
                freqMap.put(arr[i],1);
            }
        }
    }
}
