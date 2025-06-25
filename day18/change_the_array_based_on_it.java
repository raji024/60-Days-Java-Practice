package day18;
import java.util.*;
public class change_the_array_based_on_it {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int ind[] = new int[x];
        for(int i=0;i<x;i++){
            ind[i] = sc.nextInt();
        }
        ArrayList<Integer> n = new ArrayList<>();
        for(int i=0;i<x;i++){
            n.add(ind[i],arr[i]);
        }
        System.out.println(n);


    }
}
