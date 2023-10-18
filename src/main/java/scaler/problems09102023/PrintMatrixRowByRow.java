package scaler.problems09102023;

import java.util.Scanner;

public class PrintMatrixRowByRow {
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
        for(int i=0;i<x.length;i++){
            for(int j=0;j<numCols;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}
