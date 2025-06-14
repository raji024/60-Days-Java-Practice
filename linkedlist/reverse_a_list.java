package linkedlist;
import java.util.*;
class node1{
    int data;
    node1 next;
    node1(int data){
        this.data = data;
        this.next = null;
    }
}
class LL{
    node1 head;
    void add_back(int data){
        node1 n1 = new node1(data);
        if(head == null){
            head = n1;
            return;
        }
        if(head.next==null){
            head.next = n1;
            return;

        }
        node1 current = head;
        while(current.next!=null){
             current = current.next;
        }
        current.next = n1;
   }
   void print() {
        node1 current = head;

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
   
}

public class reverse_a_list {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        LL r = new LL();

        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
            r.add_back(arr[i]);
        }
        r.print();
    }
}
