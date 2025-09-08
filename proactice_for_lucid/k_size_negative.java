package proactice_for_lucid;
import java.util.*;
public class k_size_negative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> p = new ArrayList<>();
        int k = sc.nextInt();
        for(int i=0;i<=x-k;i++){
            int max =0;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    max = arr[j];
                    break;
                }
            }
            p.add(max);

        }
        System.out.println(p);
    }
}
