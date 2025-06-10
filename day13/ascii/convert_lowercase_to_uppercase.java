package day13.ascii;
import java.util.*;

public class convert_lowercase_to_uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.next();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);  // convert to uppercase
            }else if(ch>='A' && ch<='Z'){
                ch = (char)(ch+32);
            }
            b.append(ch);
             // keep the character (uppercase or original uppercase)
        }

        System.out.println("Uppercase version: " + b.toString());
    }
}
