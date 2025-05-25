package day1;
import java.util.*;
public class swap_square_matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int mat[][] = new int[x][x];
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                mat[i][j] = sc.nextInt();

            }
        }
        System.out.println("before swapping:");
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<x;i++){
            for(int j=i+1;j<x;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        System.out.println("After swapping:");
        for(int m=0;m<x;m++){
            for(int n =0;n<x;n++){
                System.out.print(mat[m][n]+" ");
            }
            System.out.println();
        }
    }
}
