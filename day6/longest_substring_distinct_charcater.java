package day6;
import java.util.*;
public class longest_substring_distinct_charcater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int max =0;
        HashSet<Character> n = new HashSet<>();
        int left =0;
        for(int right =0;right<a.length();right++){
            if(n.contains(a.charAt(right))){
                n.remove(a.charAt((left)));
                left++;
            }
            n.add(a.charAt(right));
            max = Math.max(max,right-left+1);
        }
        System.out.print(max);
    }
}
