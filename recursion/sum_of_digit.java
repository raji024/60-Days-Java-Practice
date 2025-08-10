package recursion;
import java.util.*;

import day22.no_of_subarray;
public class sum_of_digit {
    public static void sum_n(int n,int sum){
        if(n==0){
            return ;
        }
        int digit = n%10;
        sum = sum +digit;
        n = n/10;


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sum_n(x, 0);
    }
}
