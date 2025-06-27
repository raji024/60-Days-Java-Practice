package day20;
import java.util.*;
public class longest_palindromic_array_number {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i]= sc.nextInt();
        }
        int max =0;
        for(int i=0;i<x;i++){
            int num = arr[i];
            if(pali(num) && num > max){
                max = num;
            }
        }
        System.out.println(max);

    }
    public static boolean pali(int n){
        int r =0;
        int temp = n;
        while(temp>0){
            int digit = temp % 10;
            r = r * 10 + digit;
            temp = temp/10;
        }
        return (r == n);
    }
}
