package proactice_for_lucid;
import java.util.*;
public class fruits_to_baskets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> n = new HashMap<>();

        int left =0;
        int max =0;
        for(int right=0;right<arr.length;right++){
            n.put(arr[right],n.getOrDefault(arr[right],0)+1);
            while(n.size()>2){
                n.put(arr[left],n.get(arr[left])-1);
                if(n.get(arr[left])==0){
                    n.remove(arr[left]);

                }
                left++;
            }
            max = Math.max(max,right-left+1);


            
        }
        System.out.println(max);
    }
}
