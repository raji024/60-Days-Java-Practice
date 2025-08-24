package matrix;
import java.util.*;

public class boundary_elemnts_matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();   // rows
        int y = sc.nextInt();   // columns
        int mat[][] = new int[x][y];

        // Input matrix
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        // Print boundary elements
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(i==0 || i==x-1 || j==0 || j==y-1){
                    System.out.print(mat[i][j] + "  "); // boundary element
                } else {
                    System.out.print("   "); // 3 spaces for alignment
                }
            }
            System.out.println();
        }
    }
}
