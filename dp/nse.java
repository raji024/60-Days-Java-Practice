package dp;
import java.util.*;
public class nse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();

        }
        int sse[] = new int[x];
        sse[0] = arr[0];
        for(int i=1;i<x;i++){
            sse[i] = Math.min(sse[i-1],arr[i]);
        }
        for(int i=0;i<x;i++){
            System.out.print(sse[i]+" ");
        }
    }
    
}
