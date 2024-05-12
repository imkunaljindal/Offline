import java.io.*;
import java.util.*;

public class MazeProblem {
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        //Write your code here
        if(sr==dr && sc==dc) {
            System.out.println(psf);
            return;
        }
        if(sr > dr || sc > dc) {
            return;
        }

        // horizontal (i,j) -> (i,j+x)
        for(int i=1;i<=dc;i++) {
            printMazePaths(sr,sc+i,dr,dc,psf+"h"+i);
        }
        //vertical (i,j) -> (i+x,j)
        for(int i=1;i<=dr;i++) {
            printMazePaths(sr+i,sc,dr,dc,psf+"v"+i);
        }
        //diagonal (i,j) --> (i+x,j+x)
        for(int i=1;i<=dr && i<=dc; i++) {
            printMazePaths(sr+i,sc+i,dr,dc,psf+"d"+i);
        }

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePaths(0, 0, n - 1, m - 1, "");
    }
}