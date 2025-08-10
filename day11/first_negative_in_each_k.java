package day11;
import java.util.*;
public class first_negative_in_each_k {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int k =sc.nextInt();
        ArrayList<Integer> b = new ArrayList<>();
        HashMap<Integer,Integer> n = new HashMap<>();
        int r =0;
        for(int i=0;i<k;i++){
            int num = arr[i];
            n.put(num,n.getOrDefault(num,0)+1);
            

        }
        for(int c : n.keySet()){
            if(c<0){
                r =c;
            }

        }
        b.add(r);
        for(int j=k;j<x;j++){
            int nub = arr[j-k];
            int c =0;
            n.put(nub,n.get(nub)-1);
            n.put(arr[j],n.getOrDefault(arr[j],0)+1);
            for(int num : n.keySet()){
                if(num <0){
                    c = num;
                    break;

                }
                b.add(c);

            }

        }
        System.out.println(b);
    }
}
