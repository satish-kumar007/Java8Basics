package scaler.problems09102023;

public class MinElementIn2DArray {
    public static void main(String[] args) {
        int[][] x = {
                {7,2,3,4},
                {5,6,1,8},
                {9,2,3,4}
        };

        solve(x);
    }
    public static int solve(int[][] A) {
        int min = Integer.MAX_VALUE;
        for(int r=0;r<A.length;r++){
            for(int c=0;c<A[0].length;c++){
                if(A[r][c] < min){
                    min = A[r][c];
                }
            }
        }
        System.out.println(min);
        return min;
    }
}
