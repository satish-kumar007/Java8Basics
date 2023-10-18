package scaler.problems09102023;

import java.util.Scanner;

public class PrintSumOfEachRow {
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
            int sum = 0;
            for(int j=0;j<x[0].length;j++){
                sum = sum + x[i][j];
            }
            System.out.print(sum+" ");
        }
    }
}
