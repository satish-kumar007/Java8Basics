package scaler.problems09102023;

import java.util.Scanner;

public class PrintMatricColByCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        int numCols = sc.nextInt();
        int[][] x = new int[numRows][numCols];
        for(int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++){
                x[i][j] = sc.nextInt();
            }
        }
        int n = x.length;
        int m = x[0].length;
        for(int c=0;c<m;c++){
            for(int r=0;r<n;r++){
                System.out.print(x[r][c]+" ");
            }
            System.out.println();
        }
    }
}
