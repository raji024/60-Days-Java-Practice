package queue;
import java.util.*;
public class implemnting_queue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        Queue<Integer> n = new LinkedList<>();
        for(int i=0;i<x;i++){
            n.offer(arr[i]);
        }
        System.out.println(n);

    }
}
