package tuf_patterns;
import java.util.*;
public class square_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
