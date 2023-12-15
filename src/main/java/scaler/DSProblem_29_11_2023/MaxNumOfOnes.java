package scaler.DSProblem_29_11_2023;

public class MaxNumOfOnes {
    public static void main(String[] args) {
        int[][]  A = {{0, 0, 0, 0},{0, 0, 0, 1},{0, 0, 1, 1},{0, 1, 1, 1}};
        solve(A);
    }
    public static int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int i=0, j=m-1, ans = 0;
        while (i<n && j>=0){
            while(j>=0 && A[i][j] == 1){
                j--;
                ans = i;
            }
            i++;
        }
        System.out.println(ans);
        return ans;
    }
}
