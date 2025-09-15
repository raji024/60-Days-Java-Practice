package tuf_patterns;
import java.util.*;
public class ulta_traingle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i=x-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
