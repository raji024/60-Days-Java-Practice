import java.util.*;
public class max_consecutive_ones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int z_c =0;
        int k = sc.nextInt();
        int max =0;
        int left =0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]==0){
                z_c++;
                
            }
            while(z_c>k){
                if(arr[left]==0){
                    z_c--;
                }
                left++;
            }
            max = Math.max(max,right-left+1);

        }
        System.out.println(max);
    }
}
