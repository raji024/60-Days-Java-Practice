package day11;
import java.util.*;
public class maximum_consecutive_ones_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int zero_c =0;
        int k = sc.nextInt();
        int left =0;
        int max =0;
        for(int right=0;right<arr.length;right++){
           if(arr[right]==0){
            zero_c++;
           }
           while(zero_c > k){
            if(arr[left]==0){
                zero_c--;
                
            }
            left++;
           }
           max = Math.max(max,right-left+1);

        }
        System.out.println(max);

    }
}
