package day5;
import java.util.*;
public class prime_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        int c=0;
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<x;i++){
            int a = arr[i];
            if(prime(a)){
              c++;
            }
        }
        System.out.println(c);
    }
    public static boolean prime(int num){
        int count =0;
        for(int i=1;i<=num;i++){
            if(num % i==0){
              count++;
            }
        }
        return count ==2;
    }
}
