package l_75;
import java.util.*;
public class maximum_no_k_pairs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int c =0;
        int left =0;
        int right = x-1;
        Arrays.sort(arr);

        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum ==k){
                left++;
                right--;
                c++;
            }else if(sum<k){
                left++;
            }else{
                
            }

        }
    }
}
