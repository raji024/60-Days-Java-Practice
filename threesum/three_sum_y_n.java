package threesum;
import java.util.*;
public class three_sum_y_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        boolean isfind = false;
        int ke = sc.nextInt();
        for(int i=0;i<x-2;i++){
            for(int j=i+1;j<x-1;j++){
                for(int k=j+1;k<x;k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum == ke){
                        isfind = true;
                        break;
                    }
                }
                if(isfind){
                    break;
                }


            }
            if(isfind){
                break;
            }
        }
        if(isfind){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
    }
}
