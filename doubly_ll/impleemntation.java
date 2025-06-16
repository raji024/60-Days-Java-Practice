class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class dL{
    Node head;
    void add_front(int data){
        Node n1 = new Node(data);
        if(head == null){
            head = n1;
        }
    }


}


package doubly_ll;

public class impleemntation {
    
}
