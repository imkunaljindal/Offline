import java.util.*;
import java.util.Stack;

public class AsteroidCollision {

    public static List<Integer> asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int asteroid: asteroids) {
            if(asteroid > 0) {
                st.push(asteroid);
            }
            else {
                while(st.size()> 0 && st.peek() < Math.abs(asteroid) && st.peek() > 0) {
                    st.pop();
                }
                if(st.size()> 0 && st.peek() > 0 && st.peek()==Math.abs(asteroid)) {
                    st.pop();
                }
                else if(st.size()> 0 && st.peek() > Math.abs(asteroid)) {
                }
                else st.push(asteroid);
            }
        }

        List<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()) {
            ans.add(st.peek());
            st.pop();
        }

        Collections.reverse(ans);  // O(n)
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] asteroids = new int[n];

        for (int i = 0; i < n; i++) {
            asteroids[i] = scanner.nextInt();
        }

        List<Integer> ans = asteroidCollision(asteroids);

        if(ans.size()==0){
            System.out.print(-1);
        }else{
            for (int asteroid : ans) {
                System.out.print(asteroid + " ");
            }
        }
    }
}
