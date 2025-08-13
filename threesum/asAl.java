package threesum;
import java.util.*;
public class asAl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int ke = sc.nextInt();
        boolean isfind = false;
        ArrayList<List<Integer>> n = new ArrayList<>();
        for(int i=0;i<x-2;i++){
            for(int j=i+1;j<x-1;j++){
                for(int k=j+1;k<x;k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum == ke){
                        n.add(Arrays.asList(arr[i],arr[j],arr[k]));
                        isfind = true;
                    }
                    
                }
            }
        }
        if(!isfind){
            System.out.println("No triplets found");
        }else{
            System.out.println(n);
        }
    

    }
}
