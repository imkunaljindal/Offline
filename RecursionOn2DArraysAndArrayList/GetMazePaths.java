import java.io.*;
import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> paths = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(paths);
    }

//    static void helper(int sr, int sc, int dr, int dc, String path, ArrayList<String> ans) {
//        // base
//        if(sr==dr && sc==dc) {
//            ans.add(path);
//            return;
//        }
//        if(sr > dr || sc > dc) return;
//
//        // h (i,j) -> (i,j+1)
//        helper(sr,sc+1,dr,dc,path+"h",ans);
//        // vertical (i,j) -> (i+1,j)
//        helper(sr+1,sc,dr,dc,path+"v",ans);
//    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
//        ArrayList<String> ans = new ArrayList<>();
//        helper(sr,sc,dr,dc,"",ans);
//        return ans;
        if(sr > dr || sc > dc) {
            return new ArrayList<>();
        }

        if(sr==dr && sc==dc) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        ArrayList<String> result = new ArrayList<>();
        // get all paths after 1 horizontal step
        ArrayList<String> hPaths = getMazePaths(sr,sc+1,dr,dc);
        for(String hPath: hPaths) {
            result.add("h" + hPath);
        }

        ArrayList<String> vPaths = getMazePaths(sr+1,sc,dr,dc);
        for(String vPath: vPaths) {
            result.add("v" + vPath);
        }

        ArrayList<String> dPaths = getMazePaths(sr+1,sc+1,dr,dc);
        for(String dPath: dPaths) {
            result.add("d" + dPath);
        }

        return result;
    }
}


                        
                        
                        
                        
                        
                                

                        
                                