package scaler.problems09102023;

public class Check2MatrixEquality {
    public static void main(String[] args) {
        int x[][] = {{1,2,3},{7,2,3}};
        int y[][] = {{1,2,3},{7,2,3}};
        //int y[][] = {{1,2,4},{3,4,6}};
        solve(x,y);
    }
    public static int solve(int[][] A, int[][] B) {
        int raLen = A.length;
        int caLen = A[0].length;
        int ans = 1;

        for(int i=0;i<raLen;i++){
            for(int j=0;j<caLen;j++){
                System.out.println(A[i][j]+"  ::  "+B[i][j]);
                if(A[i][j] != B[i][j]){
                    ans=0;
                }
            }
        }
        System.out.println(ans);
        return ans;
    }
}
