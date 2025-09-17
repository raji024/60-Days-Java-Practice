package hollow;
import java.util.*;
public class hollow_rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(i==1||i==x||j==1||j==y){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
