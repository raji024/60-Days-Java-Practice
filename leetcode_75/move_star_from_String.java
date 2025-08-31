package leetcode_75;
import java.util.*;
public class move_star_from_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder b = new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='*'){
              b.deleteCharAt(b.length()-1);
            }else{
                b.append(a.charAt(i));
            }
        }
        System.out.println(b.toString());


    }
}
