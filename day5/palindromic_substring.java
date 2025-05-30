package day5;
import java.util.*;
public class palindromic_substring {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      int c=0;
      for(int i=0;i<a.length();i++){
        for(int j=i+1;j<=a.length();j++){
            String sub = a.substring(i, j);
            if(ispali(sub)){
                c++;
            }

        }
      }
      System.out.println(c);
    }
    public static boolean ispali(String r){
        String rev ="";
        for(int i=r.length()-1;i>=0;i--){
           char ch = r.charAt(i);
           rev+=ch;
           

        }
        return r.equals(rev) ;  
    }


}
