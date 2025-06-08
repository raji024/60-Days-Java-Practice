package day10;
import java.util.*;
public class substring_palindrome {
    public static void main(String[]args){
        int count =0;
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<=a.length();j++){
                String ch = a.substring(i,j);
                if(prime(ch)){
                    count++;
                }
            }
            
        }
        System.out.println(count);
    }
    public static  boolean prime(String b){
        String n ="";
        for(int i=b.length()-1;i>=0;i--){
           n+=b.charAt(i);
        }
        if(b.equals(n)){
            return true;
        }else{
            return false;
        }
    }
}
