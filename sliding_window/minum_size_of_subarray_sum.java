package sliding_window;
import java.util.*;
public class minum_size_of_subarray_sum {
    Scanner sc =  new Scanner(System.in);
    int x = sc.nextInt();
    int arr[] = new int[x];
    for(int i=0;i<x;i++){
        arr[i] = sc.nextInt();

    }
    int min = Integer.MAX_VALUE;
    int k = sc.nextInt();
    int left =0;
    int sum =0;
    for(int right=0;right<x;right++){
        sum+=arr[right];
        while(sum>=k){
            sum-=left;
            left++;

        }
        min = Math.min(min,right-left+1); 

    }
    System.out.println(min);


}
}
