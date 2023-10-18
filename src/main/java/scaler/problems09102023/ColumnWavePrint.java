package scaler.problems09102023;

import java.util.Scanner;

public class ColumnWavePrint {
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
        int rowLength = x.length;
        int colLength = x[0].length;
        for(int c=0;c<colLength;c++){
            if(c%2 == 0){
                for(int r=0;r<rowLength;r++){
                    System.out.print(x[r][c]+" ");
                }
            }else{
                for(int r=rowLength-1;r>=0;r--){
                    System.out.print(x[r][c]+" ");
                }
            }
        }
    }
}
