package scaler.DSProblem_29_11_2023;

public class GenerateSpiralMatrix {

    public static void main(String[] args) {
        generateMatrix(5);
    }
    public static int[][] generateMatrix(int A) {
        int[][] spiral = new int[A][A];
        int value = 1;
        int minCol = 0;
        int maxCol = A-1;
        int minRow = 0;
        int maxRow = A-1;
        while (value <= A*A)		{
            for (int i = minCol; i <= maxCol; i++){
                spiral[minRow][i] = value;
                value++;
            }
            for (int i = minRow+1; i <= maxRow; i++){
                spiral[i][maxCol] = value;
                value++;
            }
            for (int i = maxCol-1; i >= minCol; i--){
                spiral[maxRow][i] = value;
                value++;
            }

            for (int i = maxRow-1; i >= minRow+1; i--){
                spiral[i][minCol] = value;
                value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }

        for (int i = 0; i < spiral.length; i++){
            for (int j = 0; j < spiral.length; j++){
                System.out.print(spiral[i][j]+ "\t");
            }

            System.out.println();
        }
        return spiral;
    }
}
