package day18;
import java.util.*;
public class change_based_on_array {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int  x = sc.nextInt();
        int arr[] = new int [x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        String a = sc.next();
        char ch[] = a.toCharArray();
        int index =0;
        char result[] = new char[x];
        for(int i=0;i<x;i++){
            result[arr[i]] = a.charAt(i);
        }
        StringBuilder n = new StringBuilder();

        for(int i=0;i<x;i++){
            n.append(result[i]);
        }
        System.out.println(n.toString());

    }
}
