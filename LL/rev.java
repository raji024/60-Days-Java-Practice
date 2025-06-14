package LL;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void addBack(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }
    void reverse(){
        Node prev = null;
        Node next = null;
        Node current = head;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;
    }
    boolean pali(){
     Stack<Integer> a = new Stack<>();
     Node current =head;
     while(current!=null){
        a.add(current.data);
        current = current.next;
     }
     Node n = head;
     while(current!=null){
          if(current.data!=a.pop()){
            return false;
          }
          current = current.next;


     }
     return true;

    }

    void printList() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println(current.data); // Print last node without arrow
        System.out.println();
    }
}

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.addBack(val);
        }

        System.out.println("Linked list:");
        list.printList();
        list.reverse();
        list.printList();
        if(list.pali()){
            System.out.print("The given string is plaindrome");
        }else{
            System.out.print("the given stringis not plaindrome");
        }

        sc.close();
    }
}
