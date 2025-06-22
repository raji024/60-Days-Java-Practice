package queue;
import java.util.*;
public class priority_queue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        PriorityQueue<Integer> n = new PriorityQueue<>();
        for(int i=0;i<x;i++){
            n.add(arr[i]);
        }
        System.out.println(n);
        for(int num : n){
            System.out.print(num+" ");
        }
    }
}
