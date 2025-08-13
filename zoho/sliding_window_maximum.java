package zoho;
import java.util.*;
public class sliding_window_maximum {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();

        }
        int k = sc.nextInt();
        ArrayList<Integer> n = new ArrayList<>();
        for(int i=0;i<=x-k;i++){
             int num = arr[i];
             for(int j =i;j<i+k;j++){
                if(arr[j] > num){
                    num = arr[j];
                }
             }
             n.add(num);
        }
        System.out.println(n);
    }
}
