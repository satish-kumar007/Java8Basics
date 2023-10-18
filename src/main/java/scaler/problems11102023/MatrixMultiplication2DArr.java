package scaler.problems11102023;

public class MatrixMultiplication2DArr {
    public static void main(String[] args) {

    }

    public int[][] solve(int[][] A, int[][] B) {
        int[][] c = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < B.length; k++) {
                    c[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return c;
    }
}
