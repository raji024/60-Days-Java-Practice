package day4;
import java.util.*;
public class lcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int small = Math.min(x,y);
        int gcd =0;
        for(int i=1;i<=small;i++){
            if(x%i ==0 && y%i==0){
              gcd = i;
            }
        }
        int lcm  =  x*y/gcd;
        System.out.println(lcm);
    }
}
