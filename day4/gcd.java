package day4;
import java.util.*;
public class gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int f=0;
        int small = Math.min(x,y);
        for(int i=1;i<=small;i++){
            if(x% i==0 && y %i==0){
               f =i;
            }
        }
        System.out.print(f);
    }
}
