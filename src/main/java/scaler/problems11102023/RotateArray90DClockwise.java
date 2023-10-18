package scaler.problems11102023;

public class RotateArray90DClockwise {
    public static void main(String[] args) {
        int[][] x ={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
        int[][] y = {
                {1, 2},
                {3, 4}
        };
        solve(y);
//        for(int i=0;i< z.length;i++) {
//            System.out.print("[");
//            for (int j = 0; j < z[0].length; j++) {
//                System.out.print(z[i][j]+" ");
//            }
//            System.out.print("]");
//            //System.out.println();
//        }
    }
    public static void solve(int[][] A) {
        A = transposeArr(A);
        A = reverseArr(A);
        //return reverse;
        for(int i=0;i< A.length;i++) {
            System.out.print("[");
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.print("]");
            //System.out.println();
        }
    }
    public static int[][] transposeArr(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int [][]ans = new int[cols][rows];
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                ans[i][j] = A[j][i];
            }
        }
        return ans;
    }

    public static int[][] reverseArr(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        for(int i=0;i<rows;i++){
            int s=0;
            int e = cols-1;
            while(s<e){
                int temp = A[i][s];
                A[i][s] = A[i][e];
                A[i][e] = temp;
                s++;
                e--;
            }
        }
        return A;
    }
}
