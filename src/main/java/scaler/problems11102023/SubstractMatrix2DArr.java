package scaler.problems11102023;

public class SubstractMatrix2DArr {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] B = {{9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}};
        int[][] ans = solve(A,B);
        for(int r=0;r<A.length;r++){
            for(int c=0;c<A[0].length;c++){
                System.out.print(ans[r][c]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] solve(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for(int r=0;r<rows;r++){
            int sum=0;
            for(int c=0;c<cols;c++){
                result[r][c] = A[r][c] - B[r][c];
            }
        }
        return result;
    }
}
