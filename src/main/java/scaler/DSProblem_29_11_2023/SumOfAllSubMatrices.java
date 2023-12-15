package scaler.DSProblem_29_11_2023;

public class SumOfAllSubMatrices {
    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int topLeft = (i+1)*(j+1);
                int bottomRight = (n-i)*(m-j);
                sum = sum+A[i][j]*topLeft*bottomRight;
            }
        }
        return sum;
    }
}
