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
    void delete_atfront(){
        if(head == null){
          System.out.print("Thus the linkedlist is empty");
          return;
        }
        head = head.next;
    }
    void delete_atback(){
        Node current = head;
        if(head == null){
            System.out.println("Thus the linkedList is empty");
            return;

        }
        if(head.next == null){
            head =null;
            return;
        }
        while(current.next.next!=null){
            current = current.next;
        }
        current.next = null;

    }
    void search(int key){
        Node current = head;
        int pos =0;
        boolean found = false;
        while(current!=null){
             if(current.data == key){
                System.out.println("the elmnt is found at:"+pos);
                found = true;
                break;
             }
             pos++;
             current = current.next;
             
        }
        if(!found){
                System.out.println("the elemnt is found on linkedlist");
             }
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
        System.out.println();
    }
    void sort(){
        for(Node current = head; current!=null; current= current.next){
            for(Node t = current.next;t!=null;t = t.next){
                if(current.data > t.data){
                    int temp  = current.data;
                    current.data = t.data;
                    t.data = temp;
                }
            }
        }
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
        
        r.add_at_end(x);
        r.delete_atback();
        r.delete_atfront();
        r.print();
        r.sort();
        r.print();
        r.search(12);
         r.search(9);

    }
}
