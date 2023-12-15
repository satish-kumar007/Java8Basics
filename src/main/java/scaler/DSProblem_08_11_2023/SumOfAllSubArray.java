package scaler.DSProblem_08_11_2023;

public class SumOfAllSubArray {
    public static void main(String[] args) {
        int[] x = {2, 1, 3};
        System.out.println(subarraySum(x));
    }
    public static long subarraySum(int[] A) {
        int n = A.length;
        long ans = 0;
        for(int i=0;i<n;i++){
            long occurrance = (i+1)*(n-i);
            long contribution = A[i] * occurrance;
            ans = ans+contribution;
        }
        return ans;
    }

}
