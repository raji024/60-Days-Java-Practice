package tuf_patterns;
import java.util.*;
public class alpha_rigght_try_column {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        char ch ='A';
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
    }
}
