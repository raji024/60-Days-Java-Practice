package recursion;
import java.util.*;
public class one_to_n_print {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        f(x);
    }
    public static void f(int n){
        if(n==0){
            return;
        }
        f(n-1);
        System.out.println(n);
    }

}
