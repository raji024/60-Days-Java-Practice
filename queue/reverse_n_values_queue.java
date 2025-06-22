package queue;
import java.util.*;

public class reverse_n_values_queue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        Queue<Integer> n = new LinkedList<>();
        for (int i = 0; i < x; i++) {
            n.add(arr[i]);
        }

        Stack<Integer> q = new Stack<>();

        // Step 1: Push first k elements from queue to stack
        for (int i = 0; i < k; i++) {
            q.push(n.remove()); // ✅ remove from queue, not from array
        }

        // Step 2: Add them back to queue in reverse order
        while (!q.isEmpty()) {
            n.add(q.pop());
        }

        // Step 3: Move the remaining elements to the back
        for (int i = 0; i < x - k; i++) {
            n.add(n.remove());
        }

        // Print the final queue
        for (int val : n) {
            System.out.print(val + " ");
        }
    }
}
