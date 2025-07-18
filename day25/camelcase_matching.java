package day25;
import java.util.*;

public class camelcase_matching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();  // Fix 1: consume leftover newline

        String a[] = new String[x];
        for(int i=0;i<x;i++){
            a[i] = sc.next();
        }

        String pattern = sc.next();
        boolean n[] = new boolean[x];

        for(int i=0;i<a.length;i++){
            String b = a[i];
            String c = "";   // Fix 3: reset per word

            for(int j=0;j<b.length();j++){
                char ch = b.charAt(j); // Fix 2: use j
                if(ch >= 'A' && ch <= 'Z'){
                    c += ch;
                }
            }

            if(c.equals(pattern)){
                n[i] = true;
            }
        }

        for(int i=0;i<x;i++){
            System.out.print(n[i] + " ");
        }
    }
}

