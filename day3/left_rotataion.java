package day3;
import java.util.*;
public class left_rotataion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=0;i<k;i++){
            int first = arr[0];
            for(int j=0;j<x-1;j++){
                arr[j] = arr[j+1];

            }
            arr[x-1] = first;
        }
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
