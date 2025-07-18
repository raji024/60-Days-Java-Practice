package day26;
import java.util.*;
public class product_except_itself {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();

        }
        int r[] = new int[x];
        r[0] = 1;
        for(int i=0;i<x;i++){
            r[i] = r[i] * arr[i-1];
        }
        int suffix =1;
        for(int j=n-1;j>=0;j--){
            r[i] = r[i] *
        }
    }
}
