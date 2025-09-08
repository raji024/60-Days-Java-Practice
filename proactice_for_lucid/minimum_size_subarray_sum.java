package proactice_for_lucid;
import java.util.*;
public class minimum_size_subarray_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int max =Integer.MAX_VALUE;
        for(int i=0;i<x;i++){
            int sum =0;
            for(int j=i;j<x;j++){
                sum+=arr[j];
                if(sum>=target){
                    max = Math.min(max,j-i+1);
                }
            }
        }
        System.out.println(max);
    }
}
