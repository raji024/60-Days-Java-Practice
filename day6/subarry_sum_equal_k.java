package day6;
import java.util.*;
public class subarry_sum_equal_k {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum =0;
        for(int i=0;i<x;i++){
            int s =0;
            for(int j=i;j<x;j++){
                s = s + arr[j];
                if(s == k){
                    sum++;
                }
            }
        }
        System.out.print(sum);

    }
}
