package proactice_for_lucid;
import java.util.*;
public class longest_substring_with_sum_k {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int max =0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum = sum+arr[j];
                if(sum == k){
                    max = Math.max(max,j-i+1);
                }

            }

        }
        System.out.println(max);
    }
}
