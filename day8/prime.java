package day8;
import java.util.*;
public class prime {
    public static void main(String[]arg){
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int count =0;
       for(int i=1;i<=x;i++){
          if(x %i==0){
            count++;
          }
       }
       if(count == 2){
        System.out.println("Thus the give number is prime number");
       }
    }
}
