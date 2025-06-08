package day10;
import java.util.*;
public class binary_decimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        int dec =0;
        int pow=0;
        for(int i=p.length()-1;i>=0;i--){
            char ch = p.charAt(i);
            if(ch =='1'){
                dec+=Math.pow(2,pow);

            }
            pow++;
        }
        System.out.println(dec);

    }
}
