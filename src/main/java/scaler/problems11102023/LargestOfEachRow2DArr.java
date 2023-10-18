package scaler.problems11102023;

public class LargestOfEachRow2DArr {
    public static void main(String[] args) {
        int[][] x ={{1,2},{1,3}};
        int[] y = solve(x);
        for(int i=0;i<y.length;i++){
            System.out.print(y[i]+" ");
        }
    }
    public static int[] solve(int[][] A) {
        int[] resultArr = new int[A.length];
        int row = A.length;
        int col = A[0].length;

        for(int i=0;i<row;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<col;j++){
                if(A[i][j] > max){
                    max = A[i][j];
                }
            }
            resultArr[i] = max;
        }
        return resultArr;
    }
}
