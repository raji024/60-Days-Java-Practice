package tuf_patterns;
import java.util.*;
public class triangle4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=x;i>=1;i--){
            for(int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
