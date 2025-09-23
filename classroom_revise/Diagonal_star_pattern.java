import java.util.*;
public class Diagonal_star_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                if(i==1||j==1||i==x||j==x||i==j||i+j==x+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
