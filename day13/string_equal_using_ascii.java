package day13;
import java.util.*;
public class string_equal_using_ascii {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int sum1 =0;
        int sum2 =0;
        for(int i=0;i<a.length();i++){
            char ch1 = a.charAt(i);
            int a1 = ch1;
            sum1+=a1;
        }
        for(int j=0;j<b.length();j++){
            char ch2 = b.charAt(j);
            int b1 = ch2;
            sum2+=b1;
        }
        if(sum1 == sum2){
            System.out.println("the given two strings are equal");
        }else{
            System.out.println("The both the strings are not equal");
        }

    }
}
