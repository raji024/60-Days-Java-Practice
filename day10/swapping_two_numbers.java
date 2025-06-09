package day10;
import java.util.*;
public class swapping_two_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);

    }
}
