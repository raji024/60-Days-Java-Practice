package day21;
import java.util.*;
public class shuffle_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();

        }
        int res[] = new int[x];
        int n = x /2;
        int index =0;
        for(int i=0;i<n;i++){
          res[index++] = arr[i];
          res[index++] = arr[i+n];
        }
        for(int i=0;i<x;i++){
            System.out.print(res[i]+" ");
        }
    }
}
