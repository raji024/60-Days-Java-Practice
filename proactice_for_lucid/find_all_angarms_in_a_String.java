import java.util.*;
public class find_all_angarms_in_a_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String t = sc.next();
        HashMap<Character,Integer> n = new HashMap<>();
        HashMap<Character,Integer> m = new HashMap<>();
        ArrayList<Integer> p = new ArrayList<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            n.put(ch,n.getOrDefault(ch,0)+1);

        }
        int left =0;
        for(int right =0;right<a.length();j++){
            char c = a.charAt(j);
            m.put(c,m.getOrDefault(c,0)+1);
            while(right-left+1 > t.length()){
                  m.put(a.charAt(left),m.get(a.charAt(left))-1);
                  if(m.get(a.charAt(left))==0){
                    m.remove(a.charAt(left));

                  }
            }
            if(right-left+1 == t.length() && m.equals(n));
            p.add(left);
        }
        System.out.println(p);

    }
}
