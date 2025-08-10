package recursion;
import java.util.*;
public class one_n {
    public static int  print_n(int n){
       if(n==0){
         return 0;
       }
       int digit = n%10;
       return digit+print_n(n/10);
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       print_n(x);
    }
}
