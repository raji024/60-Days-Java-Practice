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

class LL1 {
    Node head1;
    Node head2;

    // Add to end of first list
    void add_back1(int data) {
        Node n1 = new Node(data);
        if (head1 == null) {
            head1 = n1;
            return;
        }
        Node c1 = head1;
        while (c1.next != null) {
            c1 = c1.next;
        }
        c1.next = n1;
    }

    // Add to end of second list
    void add_back2(int data) {
        Node n2 = new Node(data);
        if (head2 == null) {
            head2 = n2;
            return;
        }
        Node c2 = head2;
        while (c2.next != null) {
            c2 = c2.next;
        }
        c2.next = n2;
    }

    // Merge two sorted linked lists and return merged head
    Node mergelist() {
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = new Node(-1);
        Node current = dummy;

        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                current.next = t1;
                t1 = t1.next;
            } else {
                current.next = t2;
                t2 = t2.next;
            }
            current = current.next;
        }

        if (t1 != null) {
            current.next = t1;
        }
        if (t2 != null) {
            current.next = t2;
        }

        return dummy.next;
    }

    // Display a given linked list
    void display(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (head != null) {
            System.out.print(head.data + (head.next != null ? "-->" : ""));
            head = head.next;
        }
        System.out.println();
    }

    // Display first list
    void dis1() {
        System.out.print("List 1: ");
        display(head1);
    }

    // Display second list
    void dis2() {
        System.out.print("List 2: ");
        display(head2);
    }
}

public class merge_two_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read sizes
        int x = sc.nextInt();  // size of first list
        int y = sc.nextInt();  // size of second list

        LL1 r = new LL1();

        // Read and insert elements into first list
        for (int i = 0; i < x; i++) {
            int val = sc.nextInt();
            r.add_back1(val);
        }

        // Read and insert elements into second list
        for (int i = 0; i < y; i++) {
            int val = sc.nextInt();
            r.add_back2(val);
        }

        // Display original lists
        r.dis1();
        r.dis2();

        // Merge and display the result
        Node mergedHead = r.mergelist();
        System.out.print("Merged List: ");
        r.display(mergedHead);
    }
}

