package day7;
import java.util.*;
public class maximum_subarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<x;i++){
            sum = sum + arr[i];
            max = Math.max(sum,max);
            if(sum < 0){
                sum =0;
            }
        }
        System.out.println(max);
    }
}
