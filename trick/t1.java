package trick;
import java.util.*;
public class t1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char ch1[] = a.toCharArray();
        Arrays.sort(ch1);
        String b = new String(ch1);
        System.out.println(b);
        
    }
}
