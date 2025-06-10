package day13;
import java.util.*;
public class count_upper_lower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int l_count =0;
        int u_count =0;
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(ch>='a' && ch<='z'){
                l_count++;
            }else if(ch>='A' && ch<='Z'){
                u_count++;
            }

        }
        System.out.println(l_count);
        System.out.println(u_count);
    }
}
