package swap;
import java.util.*;
public class odd_even_arrangement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int k=0;
        int l=1;
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(arr[i]%2==0 && arr[k]%2!=0){
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                    k+=2;



                }
                else if(arr[i]%2!=0 && arr[l]%2==0){
                    int temp = arr[i];
                    arr[i] = arr[l];
                    arr[l] = temp;
                    l+=2;
                }
            }
    }
}
}
