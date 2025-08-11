package sliding_window;
import java.util.*;
public class minium_size_subarray_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int left =0;
        int min = Integer.MAX_VALUE;
        int sum =0;
        for(int right=0;right<x;right++){
            sum+=arr[right];
            while(sum>=k){
                min = Math.min(min,right-left+1);
                sum-=arr[left];
                left++;
            }

        }
        System.out.println(min);


    }
}
