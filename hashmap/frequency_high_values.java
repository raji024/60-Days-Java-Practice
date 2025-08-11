package hashmap;
import java.util.*;
public class frequency_high_values {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> n = new HashMap<>();
        for(int i=0;i<x;i++){
            int num =arr[i];
            n.put(num,n.getOrDefault(num,0)+1);

        }
        int max = Collections.max(n.values());
        System.out.println(max);
    }
}
