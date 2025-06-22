package queue;
import java.util.*;
public class deque {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();

        }
        Deque<Integer> n = new LinkedList<>();
        for(int i=0;i<x;i++){
            n.addFirst(arr[i]);
        }
        n.addLast(10);
        n.addFirst(12);
        n.removeFirst();
        System.out.println(n);

    }
}
