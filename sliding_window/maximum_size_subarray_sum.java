package sliding_window;
import java.util.*;
public class maximum_size_subarray_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<x;i++){
            sum+=arr[i];
            max = Math.max(max,sum);
            if(sum<0){
                sum =0;
            }
        }
        System.out.println(max);
    }
}
