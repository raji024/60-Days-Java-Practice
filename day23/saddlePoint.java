package day23;
import java.util.*;
public class saddlePoint {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int x = sc.nextInt();
        int mat[][] = new int[x][x];
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int row[] = new int[x];
        int col[] = new int[x];
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                int min = mat[i][0];
                  if(mat[i][j] < min){
                    min = mat[i][j];
                    row[i] = min;
                  }
            }
        }
        for(int j=0;j<x;j++){
            max = mat[]
        }
    }
}