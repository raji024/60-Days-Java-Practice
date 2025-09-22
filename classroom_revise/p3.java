package classroom_revise;
import java.util.*;
public class p3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            int k =i;
            int diff = x-1;
            
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k=k+diff;
                diff--;
            
            }
            System.out.println();
        }
    }
}
