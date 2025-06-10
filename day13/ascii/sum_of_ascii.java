package day13.ascii;
import java.util.*;
public class sum_of_ascii {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int  sum =0;
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            int r= ch;
            sum+=r;

        }
        System.out.println(sum);

    }
}
