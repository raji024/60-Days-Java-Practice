package day21;
import java.util.*;
public class prefix_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int presum[] = new int[x];
        presum[0]  = arr[0];
        for(int i=1;i<x;i++){
            presum[i] = arr[i] + presum[i-1];


        }
        for(int i=0;i<x;i++){
            System.out.print(presum[i]+" ");
        }
     }
}
