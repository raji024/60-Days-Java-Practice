package swap;
import java.util.*;
public class negaive_before {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int je=0;
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(arr[i]>=0 && arr[j]<0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    je++;
                }
            }
        }
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
