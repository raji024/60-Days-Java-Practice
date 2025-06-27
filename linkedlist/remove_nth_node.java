package linkedlist;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LL{
     Node head;
     void add_back(int data){
          Node n1 = new Node(data);
          if(head ==  null){
            head = n1;
            return;
          }
          if(head.next == null){
             head.next = n1;
          }
          Node current = head;
          while(current.next!=null){
            current = current.next;

          }current.next = n1;
     }
     void display(){
        Node current = head;
        while(current.next!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.print(current.data);
     }
}
public class remove_nth_node {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        LL r = new LL();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
            r.add_back(arr[i]);
        }
        r.display();
        
        

    }
}
