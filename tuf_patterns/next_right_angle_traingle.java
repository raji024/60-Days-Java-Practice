package tuf_patterns;
import java.util.*;
public class next_right_angle_traingle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n =1;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}
