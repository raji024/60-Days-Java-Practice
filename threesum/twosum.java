package threesum;
import java.util.*;
public class twosum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        boolean isfound = false;
        ArrayList<int[]>p = new ArrayList<>();
        int k = sc.nextInt();
        for(int i=0;i<x-1;i++){
            for(int j=i+1;j<x;j++){
                if(arr[i]+arr[j]==k){
                   p.add(new int[]{arr[i],arr[j]});
                   isfound = true;
                }
            }
        }
        if(!isfound){
            System.out.println("Not found");
        }else{
            System.out.println(p);
        }
    }
}
