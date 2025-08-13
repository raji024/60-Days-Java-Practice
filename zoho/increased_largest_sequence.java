package zoho;
import java.util.*;

public class increased_largest_sequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int maxlen =1;

        int dp[] = new int[x];
        Arrays.fill(dp,1);
        for(int i=1;i<x;i++){
            for(int j=0;j<i;j++){
                if(arr[i]> arr[j]){
                    dp[i] = Math.max(arr[i],arr[j+1]);
                }
            }
            maxlen
        }
    }
}
