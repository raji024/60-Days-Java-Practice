package day19;
import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       String a = sc.next();
       String b = sc.next();
       boolean isan = false;

       if(a.length()!= b.length()){
          isan = true;
       }
       int freq1[] = new int[128];
       for(int i=0;i<a.length();i++){
        char ch = a.charAt(i);
        freq1[ch]++;
       }
       for(int i=0;i<b.length();i++){
        char ch1 = b.charAt(i);
        freq1[ch1]--;

       }
       for(int i=0;i<128;i++){
        if(freq1[i]>0){
           isan = false;
        }
       }
       if(isan){
        System.out.println("the given string is anagram");
       }else{
        System.out.println("the given string")
       }
    }
}