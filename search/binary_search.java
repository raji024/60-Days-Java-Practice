package search;
import java.util.*;
public class binary_search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        int index = bs(arr,r);
        if(index == -1){
            System.out.println("thus the element is not found");

        }else{
            System.out.println(index);
        }
    }
    public static int bs(int arr[],int t){
        int left =0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+right/2;
            if(arr[mid]== t){
                return mid;
            }else if(arr[mid]>t){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }
}

