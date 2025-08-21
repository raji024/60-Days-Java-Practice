package dp;
import java.util.*;
public class wildcard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean result = iswild(a,b);
        System.out.println(result);

        
    }
    public  static boolean iswild(String s,String p){
        int m = s.length();
        int n = p.length();
        boolean dp[][] = new boolean [m+1][n+1];
        dp[0][0] = true;
        for(int i=1;i<=m;i++){
            dp[i][0] = false;
        }
        for(int j=1;j<=n;j++){
            if(p.charAt(j-1)=='*'){
               dp[0][j] = dp[0][j-1];
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(p.charAt(j-1)=='*'){
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }else if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[m][n];

    }
}
