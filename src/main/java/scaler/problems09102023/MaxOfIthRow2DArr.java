package scaler.problems09102023;

public class MaxOfIthRow2DArr {
    public static void main(String[] args) {
        int[][] x = {{12, 65, 89, 74},{22, 44, 12, 30},{10, 12, 97, 19}};
        int max = solve(x,2);
        System.out.println(max);

        int colmax = solveMax(x,3);
        System.out.println(colmax);

    }
    public static int solve(int[][] A, int B) {
        int max = Integer.MIN_VALUE;
        int rowL = A.length;
        int colL = A[0].length;
        for(int i=0;i<colL;i++){
            if(A[B][i] > max){
                max = A[B][i];
            }
        }
        return max;
    }

    public static int solveMax(int[][] A, int B) {
        int max = Integer.MIN_VALUE;
        int rowL = A.length;
        int colL = A[0].length;
        for(int i=0;i<rowL;i++){
            if(A[i][B] > max){
                max = A[i][B];
            }
        }
        return max;
    }
}
