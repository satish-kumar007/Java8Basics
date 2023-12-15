package scaler.DSProblem_01_11_2023;

public class SumOfEvenIndices {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        int[][] y = {{0,2},{1,4}};
        int[] a = solve(x,y);
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int[] solve(int[] A, int[][] B) {
        int[] ans = new int[B.length];
        int n = A.length;

        for(int i=0;i<B.length;i++){
            int L = B[i][0];
            int R = B[i][1];
            int sum = 0;
            for(int j=L;j<=R;j++){
                if(j%2 == 0){
                    sum = sum+A[j];
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}
