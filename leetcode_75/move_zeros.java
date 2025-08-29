package leetcode_75;
import java.util.*;
public class move_zeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<x;j++){
                if(arr[i] ==0 && arr[j]!=0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
