package linkedlist;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL2 {
    Node head;

    void add(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = n1;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = n1;
    }

    // Rearranging by odd positions first, then even positions
    void rearrangeOddEven() {
        if (head == null || head.next == null) return;

        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;

        // Step 1: Add odd-positioned nodes (1st, 3rd, 5th...)
        while (temp != null && temp.next != null) {
            arr.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) {
            arr.add(temp.data);
        }

        // Step 2: Add even-positioned nodes (2nd, 4th, 6th...)
        temp = head.next;
        while (temp != null && temp.next != null) {
            arr.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) {
            arr.add(temp.data);
        }

        // Step 3: Update linked list with rearranged data
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.data = arr.get(i++);
            temp = temp.next;
        }
    }

    // Display method
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // Number of elements
        LL2 r = new LL2();

        for (int i = 0; i < x; i++) {
            int val = sc.nextInt();
            r.add(val);
        }

        System.out.println("Original Linked List:");
        r.display();

        r.rearrangeOddEven();

        System.out.println("Linked List After Rearranging (Odd Positions First):");
        r.display();
    }
}
