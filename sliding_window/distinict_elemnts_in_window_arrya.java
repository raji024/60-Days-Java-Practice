package sliding_window;
import java.util.*;
public class distinict_elemnts_in_window_arrya {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        HashMap<Integer,Integer> n = new HashMap<>();
        ArrayList<Integer> ne = new ArrayList<>();
        for(int i=0;i<k;i++){
            int num = arr[i];
            n.put(num,n.getOrDefault(num,0)+1);
            
        }
        ne.add(n.size());
        

        for(int j=k;j<x;j++){
            int c = arr[j-k];
            n.put(c,n.get(c)-1);
            if(n.get(c)==0){
                n.remove(c);


            }
            n.put(arr[j],n.getOrDefault(arr[j],0)+1);
            ne.add(n.size());

        }
        System.out.print(ne);
    }
}
