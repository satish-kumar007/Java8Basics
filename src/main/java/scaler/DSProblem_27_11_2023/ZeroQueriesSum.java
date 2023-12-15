package scaler.DSProblem_27_11_2023;

public class ZeroQueriesSum {
    public static void main(String[] args) {
        int[][] x = {{1,3},{4,2},{3,1}};
        int N = 7;
        solve(N,x);
    }
    private static long[] solve(int N, int Q[][]){
        long[] ans = new long[N];
        int n = Q.length;
        for(int i=0;i<n;i++){
            int start = Q[i][0];
            int value = Q[i][1];
            ans[start] = ans[start]+value;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        int len = ans.length;
        long[] psum = new long[len];
        psum[0] = ans[0];
        for(int i=1;i<len;i++){
            psum[i] = psum[i-1]+ans[i];
        }
        System.out.println();
        for(int i=0;i<psum.length;i++){
            System.out.print(psum[i]+" ");
        }
        return psum;
    }
}
