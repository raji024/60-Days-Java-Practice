package day10;
import java.util.*;
public class reverse_a_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int deci = x;
        int sum =0;
        while(deci>0){
          int rem = deci%10;
          sum = sum*10 +rem;
          deci = deci/10;
        }
        System.out.print(sum);

        }
            
    }

