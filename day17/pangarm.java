package day17;
import java.util.*;
public class pangarm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a = a.toLowerCase();
        boolean ispan = false;
        for(char ch ='a';ch<='z';ch++){
            if(a.indexOf(ch)==-1){
                ispan = true;
                break;
            }
        }
        if(ispan){
            System.out.println("the given string is pangram");
        }else{
            System.out.println("the given string is not pangram");
        }

    }
}
