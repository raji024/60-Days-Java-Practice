package ll2;
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
    Node head1;
    Node head2;
    void add_back1(int data){
        Node n1 = new Node(data);
        if(head1 == null){
            head1 = n1;
            return;
        }
        Node c1 = head1;
        while(c1.next!=null){
            c1 = c1.next;
        }
        c1.next = n1;

    }
    void add_back2(int data){
        Node n2 = new Node
    }

}
public class intersection_point {
    
}
