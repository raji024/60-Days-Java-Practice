import java.util.*;
public class impleme_statck_queue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<x;i++){
            q.add(arr[i]);
            int size = q.size();
            for(int j=1;j<size;j++){
                q.offer(q.poll());
            }
        }
        System.out.println(q);
    }
}
