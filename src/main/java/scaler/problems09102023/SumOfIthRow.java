package scaler.problems09102023;

public class SumOfIthRow {
    public static void main(String[] args) {
        int[][] x = {
                {12, 65, 89, 74},
                {22, 44, 12, 30},
                {10, 12, 97, 19} };
        solve(x,1);
    }
    public static int solve(int[][] A, int B) {
        //sum of ith row starts
        int sum = 0;
        int col = A[0].length;
        for(int i=0;i<col;i++){
            System.out.println(A[B][i]);
            sum = sum + A[B][i];
//            if(i == B){
//                sum = sum + A[i][B];
//            }
        }
        System.out.println(sum);
        //sum of ith row ends

        int sumCol = 0;
        int colLength = A[0].length;
        for(int i=0;i<A.length;i++){
            System.out.println(A[i][B]);
            sumCol = sumCol + A[i][B];
//            if(i == B){
//                sum = sum + A[i][B];
//            }
        }
        System.out.println(sumCol);

        return sumCol;
    }
}
