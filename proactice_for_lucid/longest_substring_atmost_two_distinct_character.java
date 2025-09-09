package proactice_for_lucid;
import java.util.*;
public class longest_substring_atmost_two_distinct_character {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        HashMap<Character,Integer> n = new HashMap<>();
        int left =0;
        int max =0;
        for(int right=0;right<a.length();right++){
            n.put(a.charAt(right),n.getOrDefault(a.charAt(right),0)+1);
            while(n.size()>2){
                n.put(a.charAt(left),n.get(a.charAt(left))-1);
                if(n.get(a.charAt(left))==0){
                    n.remove(a.charAt(left));
                }
                left++;
            }
            max = Math.max(max,right-left+1);

        }
        System.out.println(max);
        

    }
}
