package scaler.problems09102023;

import java.util.Scanner;

public class PrintSumOfEachColumn {
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

        for(int c=0;c<x[0].length;c++){
            int sum = 0;
            for(int r=0;r<x.length;r++){
                sum = sum + x[r][c];
            }
            System.out.print(sum+" ");
        }
    }

}
