package day11;
import java.util.*;
public class maximium_cards {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum =0;
        int max =0;
        for(int i=0;i<k;i++){
            sum = sum + arr[i];
        }
        max = sum;
        for(int i=1;i<=k;i++){
            sum = sum -arr[k-i] + arr[x-i];
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}
