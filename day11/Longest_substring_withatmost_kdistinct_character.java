package day11;
import java.util.*;
public class Longest_substring_withatmost_kdistinct_character {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int left =0;
        int max =0;
        int k = sc.nextInt();
        HashMap<Character,Integer> n = new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            n.put(ch,n.getOrDefault(ch,0)+1);
            while(n.size()>k){
               char ch1 = s.charAt(left);
               n.put(ch1,n.get(ch1)-1);
               if(n.get(ch1)== 0){
                n.remove(ch1);
               }
               left++;
            }
            if(n.size()==k){
                max = Math.max(max,right-left+1);
            }
        }
        System.out.println(max);
    }
}
