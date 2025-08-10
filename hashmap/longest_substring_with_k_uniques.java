package hashmap;
import java.util.*;
public class longest_substring_with_k_uniques {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        HashMap<Character,Integer> n = new HashMap<>();
        int left =0;
        int max =-1;
        int k = sc.nextInt();
        for(int right=0;right<a.length();right++){
            char ch = a.charAt(right);
            n.put(ch,n.getOrDefault(ch,0)+1);
            while(n.size()>k){
                n.put(a.charAt(left),n.get(a.charAt(left))-1);
                if(n.get(a.charAt(left))==0){
                    n.remove(a.charAt(left));
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
