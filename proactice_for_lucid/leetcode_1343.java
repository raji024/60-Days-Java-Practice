package proactice_for_lucid;
import java.util.*;
public class leetcode_1343 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int k = sc.nextInt();
        int sum =0;
        int max =0;
        int f =0;
        for(int j=0;j<k;j++){
            sum = sum+arr[j];


        }
        if(sum/k >=t){
           f++;
        }
        for(int i=k;i<x;i++){
            sum = sum+ arr[i-k]+arr[i];
            if(sum/k >=t){
                f++;
            }
        }
        System.out.println(f);
        
        
    }
}
