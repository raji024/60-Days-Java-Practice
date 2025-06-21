package day17;
import java.util.*;
public class trapping_rain_water {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int rightmax[] = new int[x];
        int leftmax[] = new int[x];
        leftmax [0] = arr[0];
        for(int i=1;i<x;i++){
            leftmax[i] = Math.max(arr[i],leftmax[i-1]);
        }
        rightmax[x-1] = arr[x-1];
        for(int j = x-2;j>=0;j--){
            rightmax[j] = Math.max(arr[j],rightmax[j+1]);
        }
        int sum =0;
        for(int i=0;i<x;i++){
            sum+=Math.min(leftmax[i],rightmax[i])-arr[i];
        }
        System.out.println(sum);
    }
}
