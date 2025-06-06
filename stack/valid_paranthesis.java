package stack;
import java.util.*;

public class valid_paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Stack<Character> n = new Stack<>();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                n.push(ch);
            } 
            else if (!n.isEmpty() && 
                    ((ch == ')' && n.peek() == '(') || 
                     (ch == ']' && n.peek() == '[') || 
                     (ch == '}' && n.peek() == '{'))) {
                n.pop();
            } 
            else {
                n.push(ch); // Unmatched closing bracket or invalid char
            }
        }

        if (n.isEmpty()) {
            System.out.println("It has valid parentheses");
        } else {
            System.out.println("It does not have valid parentheses");
        }
    }
}
