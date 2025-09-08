package proactice_for_lucid;
import java.util.*;
public class minimun_size_subbarya_sum2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int t=sc.nextInt();
        int max = Integer.MAX_VALUE;
        int sum =0;
        int left =0;
        for(int i=0;i<x;i++){
            sum+=arr[i];
            while(sum>=t){
               max = Math.min(max,i-left+1);
               sum-=arr[left];
               left++;
            }
        }
        System.out.println(max);
    }
}
