package day1;
import java.util.*;
public class transpose {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int mat[][] = new int[x][y];
        int rev[][] = new int[y][x];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before swapping");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                rev[j][i] = mat[i][j];
            }
        }
        System.out.println("After swapping:");
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                System.out.print(rev[i][j]+" ");
            }
            System.out.println();
        }
        

    }
}
