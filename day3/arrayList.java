package day3;
import java.util.*;
public class arrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        int indx[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<x;i++){
            indx[i] = sc.nextInt();
        }
        ArrayList<Integer> n = new ArrayList<>();
        for(int i=0;i<x;i++){
            n.add(indx[i],arr[i]);
        }
        for(int i=0;i<n.size();i++){
            System.out.print(n.get(i)+" ");
        }
    }
}
