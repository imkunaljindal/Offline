import java.util.*;
public class AJNumbers {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        StringBuilder str=new StringBuilder(input.nextLine());
        solve(str,n);
        input.close();
    }
    static boolean checkIsAj(long n) {
        if(n==0 || n==1) return false;
        int ajNums[] = {2,3,5,7,11,13,17,19,23,29};
        for(int i=0;i<ajNums.length;i++){
            if(n==ajNums[i]) return true;
        }
        for(int i=0;i< ajNums.length;i++) {
            if(n%ajNums[i]==0) return false;
        }
        return true;
    }
    static boolean isAlreadyUsed(int i, int j, boolean isUsed[]) {
        for(int k=i;k<=j;k++){
            if(isUsed[k]==true) return false;
        }
        return true;
    }

    public static void solve(StringBuilder str,int n){
        boolean isUsed[] = new boolean[n+1];
        int count = 0;
        for(int len=1;len<=n;len++) {
            for(int j=0;j<=n-len;j++) {
                long num = Long.parseLong(str.substring(j,j+len));
                if(checkIsAj(num) && isAlreadyUsed(j,j+len,isUsed)) {
                    count++;
                    for(int k=j;k<j+len;k++) isUsed[k] = true;
                }
            }
        }
        System.out.println(count);
    }
}