package guvi_problems;
import java.util.*;
public class second_smallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int f = arr[0];
        int s_min = Integer.MAX_VALUE;
        for(int i=1;i<x;i++){
            if(arr[i]!= f){
                s_min = arr[i];
                break;
            }
        }
        System.out.println(s_min);
    }
}
