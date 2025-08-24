package leetcode_75;
import java.util.*;
public class reverse_vowels_in_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char ch[] = a.toCharArray();
        int left =0;
        int right = ch.length-1;
        while(left<right){
            while(left<right && !isv(ch[left])){
               left++;

            }
            while(left<right && !isv(ch[right])){
                right++;
            }
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
            
        }
        System.out.println(new String(ch));

    }
    public static boolean isv(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='O'||c=='I'||c=='U'){
            return true;
        }else{
            return false;
        }
    }
}
