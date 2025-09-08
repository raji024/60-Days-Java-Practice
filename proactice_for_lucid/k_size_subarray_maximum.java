package proactice_for_lucid;
import java.util.*;
public class k_size_subarray_maximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> n = new ArrayList<>();
        int max =0;
        int k = sc.nextInt();
        for(int i=0;i<=x-k;i++){
            max = arr[i];
            for(int j=i;j<i+k;j++){
                if(arr[j]> max){
                    max = arr[j];
                }
            }
            n.add(max);
        }
        System.out.println(n);
    }
}
