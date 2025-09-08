package proactice_for_lucid;
import java.util.*;
public class count_distinct_elemnts_in_each_window {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        ArrayList<Integer> n = new ArrayList<>();
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<k;i++){
            int num = arr[i];
            m.put(num,m.getOrDefault(num,0)+1);

        }
        n.add(m.size());
        for(int j=k;j<x;j++){
            int b = arr[j-k];
            m.put(b,m.get(b)-1);
            if(m.get(b)==0){
                m.remove(b);
            }
            m.put(arr[j],m.getOrDefault(arr[j],0)+1);
            n.add(m.size());

        }
        System.out.println(n);

    }
}
