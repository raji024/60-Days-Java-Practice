package stack;

import java.util.*;

public class StackMinElement {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Pushing elements to the stack
        stack.push(40);
        stack.push(10);
        stack.push(30);
        stack.push(5);

        // Check if stack is empty
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        // Find the minimum element in the stack
        int min = stack.peek(); // Assume top element is minimum initially

        for (int val : stack) {
            if (val < min) {
                min = val;
            }
        }

        // Print the minimum element
        System.out.println("Minimum element in the stack is: " + min);
    }
}
