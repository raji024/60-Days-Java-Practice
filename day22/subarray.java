package day22;
import java.util.*;
public class subarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int e = sc.nextInt();
        for(int i=s;i<=e;i++){
          System.out.print(arr[i]+" ");
        }
    }
}
