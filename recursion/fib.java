package recursion;
import java.util.*;
public class fib {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fib(x));
    }
    public static int fib(int n){
        if(n==0|| n==1){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}


