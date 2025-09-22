package classroom_revise;
import java.util.*;
public class p2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num =1;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=2*x;j++){
                if(j%2==0){
                    System.out.print("*");
                }else{
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();
        }
    }
}
