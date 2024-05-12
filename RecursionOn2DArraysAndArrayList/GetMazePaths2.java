import java.io.*;
import java.util.*;

public class GetMazePaths2 {
    static void helper(int sr, int sc, int dr, int dc,
                       String path, ArrayList<String> ans){
        if(sr==dr && sc==dc) {
            ans.add(path);
            return;
        }
        if(sr > dr || sc > dc){
            return;
        }
        // horizontal h1,h2
        helper(sr,sc+1,dr,dc,path+"h1",ans);
        helper(sr,sc+2,dr,dc,path+"h2",ans);

        //vertical
        helper(sr+1,sc,dr,dc,path+"v1",ans);
        helper(sr+2,sc,dr,dc,path+"v2",ans);

        //diagonal
        helper(sr+1,sc+1,dr,dc,path+"d1",ans);
        helper(sr+2,sc+2,dr,dc,path+"d2",ans);
    }

    public static ArrayList<String> allPossiblePaths(int n, int m) {
        ArrayList<String> ans = new ArrayList<>();
        helper(1,1,n,m,"",ans);
        return ans;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> result = allPossiblePaths(n, m);
        Collections.sort(result);
        for (String str : result) {
            System.out.println(str);
        }

    }
}
