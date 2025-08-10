package hashmap;
import java.util.*;
public class longest_substring_without_repeating_char {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      int left =0;
      int max =0;
      HashSet<Character> n = new HashSet<>();
      for(int right=0;right<a.length();right++){
        char ch  = a.charAt(right);
        while(n.contains(ch)){
            n.remove(a.charAt(left));
            left++;
        }
        n.add(ch);
        max = Math.max(max,right-left+1);
      }
      System.out.println(max);
    }
}
