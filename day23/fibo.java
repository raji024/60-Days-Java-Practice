package day23;
import java.util.*;
public class fibo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n1 =0;
        int n2 =1;
        int n3 =0;
        
        int c =0;
        for(int i=0;i<x-2;i++){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            c++;
            if(c == x-2){
               System.out.print(n3);
            }
            
        }
    }
}
