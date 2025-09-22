package classroom_revise;
import java.util.*;
public class p1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            int k = i+2;
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(int i=x-1;i>=1;i--){
            int k =i+2;
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
