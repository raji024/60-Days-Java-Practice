package day24;
import java.util.*;
public class non_zero_matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int mat[][] = new int[x][y];

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        boolean row[] = new boolean[x];
        boolean col[] = new boolean[y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(mat[i][j] ==0){
                    row[i] =true;
                    col[j] = true;
                }
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(row[i] || col[j]){
                    mat[i][j] =0;
                }
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
