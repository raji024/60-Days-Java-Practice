package ll2;

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

    void add_back(int data) {
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

    void r_node(int key) {
        int length = 0;
        Node current = head;

        // 1. Count total length
        while (current != null) {
            length++;
            current = current.next;
        }

        // 2. If removing the head
        if (key == length) {
            head = head.next;
            return;
        }

        // 3. Go to (length - key - 1)th node
        int pos = length - key;
        current = head;
        for (int i = 1; i < pos; i++) {
            current = current.next;
        }

        // 4. Delete the node
        current.next = current.next.next;
    }

    void display() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print(current.data);
        System.out.println();
    }
}

public class remove_nth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // Number of elements
        LL r = new LL();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt(); // Read elements
            r.add_back(arr[i]);    // Add to linked list
        }
        int k = sc.nextInt(); // Node position from end to remove

        r.display(); // Before removal
        r.r_node(k);
        r.display(); // After removal
    }
}
