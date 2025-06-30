package day21;
import java.util.*;
public class prodcut_of_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        int lp[] = new int[x];
        int rp[] = new int[x];
        int res[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        lp[0] = arr[0];
        for(int i=1;i<x;i++){
            lp[i] = lp[i-1]*arr[i];
        }
        rp[x-1] = arr[x-1];
        for(int i=x-2;i>=0;i--){
            rp[i] = rp[i+1] * arr[i];
        }
        for(int i=0;i<x;i++){
            res[i] = lp[i] * rp[i];
        }
        for(int i=0;i<x;i++){
            System.out.print(res[i]+" ");
        }
    }
}
