package zoho;
import java.util.*;
public class firsr_positive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> n = new HashSet<>();
        for(int a : arr){
            n.add(a);
        }
        int index =-1;
        for(int i=1;i<=x+1;i++){
            if(!n.contains(i)){
                index =i;
            }


        }
        
    }
}
