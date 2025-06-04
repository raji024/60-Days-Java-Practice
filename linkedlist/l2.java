package linkedlist;
import java.util.*;
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
        this.next = null;
    }
}
class LL1{
    Node1 head;
    void add_b1(int data){
      Node1 a = new Node1(data);
      if(head == null){
        head = a;
        return;
      }
      Node1 current = head;
      while(current.next!=null){
        current = current.next;
      }
      current.next = a;
    }
    void reverse(){
        Node1 next = null;
        Node1 prev = null;
        Node1 current = head;
        while(current!=null){
            next =  current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;
    }
    void display(){
        if(head == null){
            System.out.println("Thus the linked list is empty");
            return;
        }
        Node1 current = head;
        while(current.next!=null){
           System.out.print(current.data+"-->");
           current = current.next;
        }
        System.out.print(current.data);
        System.out.println();
    }
}
public class l2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        LL1 r = new LL1();

        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
            r.add_b1(arr[i]);

        }
        r.display();
        r.reverse();
        r.display();



    }
}
