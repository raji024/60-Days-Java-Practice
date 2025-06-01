package day6;
import java.util.*;

public class max_subarray_size_k {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int max =0;
        int sum =0;
        for(int i=0;i<k;i++){
            sum = sum + arr[i];
        }
        max = sum;
        for(int i=k;i<x;i++){
            sum = sum + arr[i] -arr[i-k];
            max = Math.max(max,sum);
        }
        System.out.println(max);

    }
}
