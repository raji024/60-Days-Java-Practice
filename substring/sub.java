package substring;
import java.util.*;
public class sub {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        int x = a.length();
        int c=0;
        for(int i=0;i<x;i++){
            for(int j=i+1;j<=x;j++){
                String b = a.substring(i,j);
                if(pali(b)){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
    public static boolean pali(String re){
        String c="";
        for(int i=re.length()-1;i>=0;i--){
            char ch = re.charAt(i);
            c+=ch;
        }
        if(c.equals(re)){
            return true;
        }else{
            return false;
        }

    }
}
