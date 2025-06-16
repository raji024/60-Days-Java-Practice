package stack;
import java.util.*;

public class InfixToPostfix {

    // Function to return precedence of operators
    static int prior(char ch){
        switch(ch){
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    // Function to convert infix expression to postfix
    public static String itop(String s){
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If operand, directly add to result
            if ((ch >= 'A' && ch <= 'Z') || 
                (ch >= 'a' && ch <= 'z') || 
                (ch >= '0' && ch <= '9')) {
                ans.append(ch);
            }
            // If '(', push to stack
            else if (ch == '(') {
                st.push(ch);
            }
            // If ')', pop and add to result until '('
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop(); // remove the '('
                }
            }
            // If operator
            else {
                while (!st.isEmpty() && prior(ch) <= prior(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        // Pop any remaining operators from the stack
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }

    // Main method to test the code
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Infix Expression: ");
        String input = sc.next();
        String result = itop(input);
        System.out.println("Postfix Expression: " + result);
    }
}
