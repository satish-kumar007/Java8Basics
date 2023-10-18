package scaler.problems09102023;

public class MaxElementIn2DArray {
    public static void main(String[] args) {
        int[][] x = { {12, 65, 89, 74},
                    {22, 44, 12, 30},
                    {10, 12, 97, 19} };
        solve(x);
    }
    public static int solve(int[][] A) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            for(int j =0;j<A[0].length;j++){
                if(A[i][j] > max){
                    max = A[i][j];
                }
            }
        }
        System.out.println(max);
        return max;
    }
}
