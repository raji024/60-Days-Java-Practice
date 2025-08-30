package recursion;
import java.util.*;
public class n_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        n(x);

    }
    public static void n(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        n(n-1);
    }
}
