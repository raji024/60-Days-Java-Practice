package day13.ascii;
import java.util.*;
public class convert_sring_to_asccii_code {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            int b = ch;
            System.out.print(b+" ");
        }
    }
}
