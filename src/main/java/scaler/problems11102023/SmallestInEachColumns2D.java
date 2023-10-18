package scaler.problems11102023;

public class SmallestInEachColumns2D {
    public static void main(String[] args) {
        int[][] x = {   {35,85},
                        {73,81},
                        {35,86},
                        {73,31},
                        {58,58},
                        {18,25} };
        int[] y = solve(x);
        for(int i=0;i<y.length;i++){
            System.out.print(y[i]+" ");
        }
    }
    public static int[] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[] ans = new int[cols];

        for(int i = 0;i<cols;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<rows;j++){
                if(A[j][i] < min){
                    min = A[j][i];
                }
            }
            ans[i] = min;
        }
        return ans;
    }
}
