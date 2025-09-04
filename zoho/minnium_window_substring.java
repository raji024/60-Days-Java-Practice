package zoho;
import java.util.*;
public class minnium_window_substring {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int no = Integer.MAX_VALUE;
        String a = sc.nextLine();
        String t = sc.nextLine();
        String f="";
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<=a.length();j++){
                String sub = a.substring(i,j);
                if(cAll(sub, t) && sub.length()< no){
                   no = sub.length();
                   f = sub;
                }
            }
        }
        System.out.println(f);
    }
    public static boolean cAll(String sub,String t){
        
        HashMap<Character,Integer> n = new HashMap<>();
        for(char ch : t.toCharArray()){
            n.put(ch,n.getOrDefault(ch,0)+1);

        }
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i=0;i<sub.length();i++){
            char ch = sub.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);

        }
        for(char ch : n.keySet()){
            int required = n.get(ch);
            int having = m.getOrDefault(ch,0);
            if(having < required){
                return false;
            }
        }
        return true;
        
    }
}
