
package zoho;
import java.util.*;
public class grouped_anagram {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       String a[] = new String[x];
       for(int i=0;i<x;i++){
        a[i] = sc.next();
       }
       ArrayList<List<String>> n = new ArrayList<>();
       HashMap<String,List<String>> m= new HashMap<>();
       for(String num : a){
        char ch[] = num.toCharArray();
        Arrays.sort(ch);
        String c = new String(ch);
        if(!m.containsKey(c)){
            m.put(c,new ArrayList<>());

            
        }
        m.get(c).add(num);
       }
       n.addAll(m.values());
       System.out.println(n);

    }
    
}
