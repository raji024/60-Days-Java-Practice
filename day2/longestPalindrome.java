package day2;
import java.util.*;
public class longestPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        HashMap<Character,Integer> n = new HashMap<>();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            n.put(ch,n.getOrDefault(ch,0)+1);
        }
        int count =0;
        boolean hasodd = false;
        for(int c : n.values()){
            if(c % 2 ==0){
                count = count + c;
            }else{
                count = count + c -1;
                hasodd = true;
            }
        }
        if(hasodd){
            count = count +1;

        }
        System.out.println(count);
    }
}
