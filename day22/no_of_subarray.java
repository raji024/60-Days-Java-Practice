package day22;
import java.util.*;
public class no_of_subarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int t = x * (x+1)/2;
        System.out.println(t);
    }
}
