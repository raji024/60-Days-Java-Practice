package day17;
import java.util.*;
public class fisrt_unique_character {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String  a= sc.next();
        HashMap<Character,Integer> n = new HashMap<>();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            n.put(ch,n.getOrDefault(ch,0)+1);
        }
        int index =-1;
       for(int i=0;i<a.length();i++){
           if(n.get(a.charAt(i))==1){
              index =i;
              break;
           }
       }
       System.out.println(index);
    }
}
