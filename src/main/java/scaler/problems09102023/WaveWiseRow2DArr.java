package scaler.problems09102023;

import java.util.Scanner;

public class WaveWiseRow2DArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        int numCols = numRows;
        int[][] x = new int[numRows][numCols];
        for(int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++){
                x[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<numRows;i++){
            if(i%2 == 0) {
                for(int j=0;j<numCols;j++){
                    System.out.print(x[i][j]+" ");
                }
            }else{
                for(int j=numCols-1;j>=0;j--){
                    System.out.print(x[i][j]+" ");
                }
            }
        }
    }
}
