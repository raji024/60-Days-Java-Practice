package day10;
import java.util.*;
public class binary_serach {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int arr[] = new int[x];
       for(int i=0;i<x;i++){
        arr[i] = sc.nextInt();
       }
       int t = sc.nextInt();
       int left =0;
       int right = arr.length-1;
       boolean isfound =false;
       while(left<=right){
        int mid = (left+right)/2;
        if(arr[mid] == t){
            System.out.println(mid);
            isfound = true;
            break;

        }else if(arr[mid] < t){
           left = mid+1;

        }else{
            right = mid-1;
        }

       }
       if(!isfound){
        System.out.println("Thus the elment is not found");
       }

    }
}
