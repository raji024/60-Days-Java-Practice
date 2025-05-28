package day3;
import java.util.*;

public class spiral_matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns
        int[][] mat = new int[n][m];
        
        // Input the matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int r_s = 0, c_s = 0;
        int r_e = n - 1, c_e = m - 1;

        while(r_s <= r_e && c_s <= c_e){
            // Top row
            for(int i = c_s; i <= c_e; i++){
                System.out.print(mat[r_s][i] + " ");
            }
            r_s++;

            // Right column
            for(int i = r_s; i <= r_e; i++){
                System.out.print(mat[i][c_e] + " ");
            }
            c_e--;

            // Bottom row (if any)
            if(r_s <= r_e){
                for(int i = c_e; i >= c_s; i--){
                    System.out.print(mat[r_e][i] + " ");
                }
                r_e--;
            }

            // Left column (if any)
            if(c_s <= c_e){
                for(int i = r_e; i >= r_s; i--){
                    System.out.print(mat[i][c_s] + " ");
                }
                c_s++;
            }
        }
    }
}
