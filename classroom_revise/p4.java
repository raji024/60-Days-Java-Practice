package classroom_revise;
import java.util.*;
public class p4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=x;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=x-1;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=x;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
