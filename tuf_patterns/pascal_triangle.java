package tuf_patterns;
import java.util.*;
public class pascal_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=i;j<=x-1;j++){
                System.out.print(" ");
            }
            int num =1;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num = num*(i-j)/j;
            }
            System.out.println();
        }
        
    }
}
