package day1;
import java.util.*;
public class box_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=x;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            for(int j=1;j<=2*x-i*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
            
        }
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            for(int j=1;j<=2*x-i*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
            
        }
    }
}
