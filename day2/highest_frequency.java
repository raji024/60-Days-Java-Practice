package day2;
import java.util.*;
public class highest_frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        HashMap<Character,Integer> n = new HashMap<>();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            n.put(ch,n.getOrDefault(ch,0)+1);

        }
        int max =0;
        char r ='\0';
        for(char c : n.keySet()){
            if(n.get(c) > max){
                max = n.get(c);
                r = c;
            }
        }
        System.out.println("the highest frequency is "+max+r);
    }
}
