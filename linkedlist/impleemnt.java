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

class LL {
    Node head;

    // Add at beginning (not used here, but included for completeness)
    void add_at_begin(int data) {
        Node n1 = new Node(data);
        n1.next = head;
        head = n1;
    }

    // Add at end
    void add_at_end(int data) {
        Node n1 = new Node(data);

        if (head == null) {
            head = n1;  // Fix: Create the first node
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = n1;
    }

    // Print the linked list
    void print() {
        Node current = head;

        if (current == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        while (current.next != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print(current.data);  // print the last node without arrow
    }
}

public class impleemnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int x = sc.nextInt();

        LL r = new LL();
        int arr[] = new int[x];

        System.out.println("Enter the elements:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
            r.add_at_end(arr[i]);
        }

        System.out.println("Linked List:");
        r.print();
    }
}
