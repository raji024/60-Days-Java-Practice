import java.util.*;
public class container_with_atomts_water {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int max =0;
        int left =0;
        int right = arr.length-1;
        while(left<right){
            int h = Math.min(arr[right],arr[left]);
            int width = right-left;
            int area = h * width;
            max = Math.max(area,max);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(max);
    }
}
