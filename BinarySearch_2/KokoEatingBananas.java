import java.util.Scanner;

class Solution {

    public static boolean isPossible(int []piles, int H, int speed) {
        int hoursTaken = 0;
        for(int i=0;i<piles.length;i++) {
            hoursTaken += Math.ceil((piles[i])*1.0/speed);
        }
        System.out.println(hoursTaken);
        return (hoursTaken <= H) ? true: false;
    }

    public static int minEatingSpeed(int[] piles, int H) {
        int maxPileSize = 0;
        for(int pile:piles) {
            maxPileSize = Math.max(maxPileSize,pile);
        }

        int low = 1;
        int high = maxPileSize;
        int ans = -1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(isPossible(piles,H,mid)) {
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;

    }
}

public class KokoEatingBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int h = scanner.nextInt();
        System.out.println(Solution.minEatingSpeed(array, h));
        scanner.close();
    }
}
