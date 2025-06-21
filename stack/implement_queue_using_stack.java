import java.util.*;

public class implement_queue_using_stack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();

        // Push elements to queue (push costly method)
        for(int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
            
            // Move everything from a to b
            while (!a.isEmpty()) {
                b.push(a.pop());
            }

            // Push new element to a
            a.push(arr[i]);

            // Move everything back from b to a
            while (!b.isEmpty()) {
                a.push(b.pop());
            }
        }

        // Pop all elements from queue (FIFO)
        System.out.println("Queue elements:");
        while (!a.isEmpty()) {
            System.out.print(a.pop() + " ");
        }
    }
}
