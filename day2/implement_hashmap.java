package day2;
import java.util.*;
public class implement_hashmap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        LinkedHashMap<Character,Integer> n = new LinkedHashMap<>();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            n.put(ch,n.getOrDefault(ch,0)+1);
        }
        for(char b:n.keySet()){
            System.out.println(b+"-->"+n.get(b));
        }

    }
}
