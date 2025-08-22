package swap;
import java.util.*;
public class zoho_swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<x;i++){
            for(int j=i+1;j<x;j++){
                
                // Even numbers -> descending order
                if(arr[i] % 2 == 0 && arr[j] % 2 == 0){
                    if(arr[i] < arr[j]){   // DESCENDING
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                
                // Odd numbers -> ascending order
                else if(arr[i] % 2 != 0 && arr[j] % 2 != 0){
                    if(arr[i] > arr[j]){   // ASCENDING
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        
        for(int i=0;i<x;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
