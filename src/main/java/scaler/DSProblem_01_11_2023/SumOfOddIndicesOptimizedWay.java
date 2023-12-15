package scaler.DSProblem_01_11_2023;

public class SumOfOddIndicesOptimizedWay {
    public static void main(String[] args) {
        int[] x = {13,11,15,7,15,2};
        int[][] y = {{2,6},{1,4}};
        int[] odd = oddPrefixSum(x);
        for(int i =0;i<odd.length;i++){
            System.out.print(odd[i]+" ");
        }
    }
    public int[] solve(int[] A, int[][] B) {
        int n = B.length;
        int[] ans = new int[n];
        int[] oddPref = oddPrefixSum(A);
        for(int i=0;i<n;i++){
            int sum = oddPref[B[i][1]];
            if(B[i][0] > 0){
                sum = sum - (oddPref[B[i][0] - 1]);
            }else{
                sum = sum - oddPref[B[i][0]];
            }
            ans[i] = sum;
        }
        return ans;
    }

    public static int[] oddPrefixSum(int[] A){
        int n = A.length;
        int[] oddPref = new int[n];
        oddPref[0] = A[0];
        for(int i=1;i<n;i++){
            if(i % 2 == 1){
                oddPref[i] = oddPref[i-1] + A[i];
            }else{
                oddPref[i] = oddPref[i-1];
            }
        }
        return oddPref;
    }
}
