package stack;
import java.util.*;
public class stack_imply {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> n = new Stack<>();
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
            n.add(arr[i]);
        }
        
        
        System.out.println("Stack:"+n);
        System.out.println(n.pop());
        System.out.println(n.peek());
        System.out.println(n.isEmpty());
    }
}
