package scaler.problems11102023;

public class SumOfColumns {
    public static void main(String[] args) {
        int[][] x = {{12, 65, 89, 74},
                {22, 44, 12, 30},
                {10, 12, 97, 19}};
        int[] result = solve(x);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] solve(int[][] A) {
        int cols = A[0].length;
        int rows = A.length;
        int[] arr = new int[cols];
        for(int i=0;i<cols;i++){
            int sum=0;
            for(int j=0;j<rows;j++){
                sum = sum + A[j][i];
            }
            arr[i] = sum;
        }
        return arr;
    }
}
