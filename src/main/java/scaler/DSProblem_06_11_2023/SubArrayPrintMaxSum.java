package scaler.DSProblem_06_11_2023;

public class SubArrayPrintMaxSum {
    public static void main(String[] args) {

    }

    public long solve(int[] A) {
        int n = A.length;
        long max = Integer.MIN_VALUE;
        for (int s = 0; s < n; s++){
            long sum = 0;
            for (int e = s; e < n; e++) {
                sum = sum + A[e];
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}
