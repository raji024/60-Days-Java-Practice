package dp;
import java.util.*;
public class climbing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int dp[] = new int[x+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=x;i++){
            dp[i] = dp[i-1] + dp[i-2];

        }
        
    }
}
