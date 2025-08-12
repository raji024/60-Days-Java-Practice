package binarySearch;
import java.util.*;
public class lowerBound {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int y = sc.nextInt();
        for(int j=0;j<x;j++){
            if(arr[j]>=y){
                System.out.println(arr[j]);
                break;
            }
        }

    }
}
