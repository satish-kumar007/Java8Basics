package scaler.DSProblem_08_11_2023;

public class SubArraySumFixedLength {
    public static void main(String[] args) {
        int[] x = {3, 9, 5, 6, 5, 11};
        int B=3;
        System.out.println(solve(x,B));
    }
    public static long solve(int[] A, int B) {
        int n = A.length;
        long maxSum = Long.MIN_VALUE;
        int s=0;int e=B-1;
        while(e<n){
            long sum = 0;
            for(int i=s;i<=e;i++){
                sum = sum+A[i];
            }
            maxSum = Math.max(maxSum, sum);
            s++; e++;
        }
        return maxSum;
    }
}
