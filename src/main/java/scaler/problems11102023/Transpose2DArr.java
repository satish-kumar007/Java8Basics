package scaler.problems11102023;

public class Transpose2DArr {
    public static void main(String[] args) {

    }
    public int[][] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int [][]ans = new int[cols][rows];
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                ans[i][j] = A[j][i];
            }
        }
        return ans;
    }
}
