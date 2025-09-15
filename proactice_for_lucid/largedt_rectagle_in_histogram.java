import java.util.*;
public class largedt_rectagle_in_histogram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int width =0;
        int f =0;
        for(int i=0;i<x;i++){
            int min = arr[i];
            for(int j=i;j<x;j++){
                if(arr[j]< min){
                    min = arr[j];

                }
                width = j-i+1;
                int r = width * min;
                f = Math.max(r,f);

                
            }

        }
        System.out.println(f);
    }
}
