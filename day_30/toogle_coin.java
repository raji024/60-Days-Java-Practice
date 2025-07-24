package day_30;
import java.util.*;
public class toogle_coin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<x;i++){
            if(arr[i] ==1){
                for(int j=0;j<i;j++){
                    if(arr[j] ==1){
                        arr[j] = 0;
                    }else{
                        continue;
                    }
                }
                for(int k=i+1;k>x;k++){
                    if(arr[k] == 1){
                        arr[k] = 0;
                    }else{
                        continue;
                    }
                }
            }else{
                continue;
            }
        }
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
