package scaler.DSProblem_01_11_2023;

public class SumOfEvenIndicesOptimizedWay {
    public static void main(String[] args) {
        int[] x = {16,3,3,6,7,8,17,13,7};
        int[][] y = {{2,6},{1,4}};
        int[] range = prefixSumArray(x);
        for(int i =0;i<range.length;i++){
            System.out.print(range[i]+" ");
        }
        System.out.println();
        int[] range1 = solveOptimized(x,y);
        for(int i =0;i<range1.length;i++){
            System.out.print(range1[i]+" ");
        }
    }
   public static int[] solveOptimized(int[] A, int[][] B) {
        int n = B.length;
        int pref[] = prefixSumArray(A);
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            int sum = pref[B[i][1]];
            if(B[i][0] > 0){
                sum = sum - pref[B[i][0] - 1];
            }
            ans[i] = sum;
        }
        return ans;
    }
    //int[] x = {1, 2, 3, 4, 5};
    public static int[] prefixSumArray(int[] A){
        int n = A.length;
        int[] ans = new int[n];
        ans[0] = A[0];
        for(int i=1;i<n;i++){
            if(i%2==0)
                ans[i] = ans[i-1] + A[i];
            else
                ans[i] = ans[i-1];
        }
        return ans;
    }
}
