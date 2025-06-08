package day10;
import java.util.*;
public class integer_to_binary {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String a="";
        int deci =x;

        while(deci>0){
           int rem = deci % 2;
           a = rem + a;
           deci = deci/2;
        }
        System.out.println(a);


    }
}
