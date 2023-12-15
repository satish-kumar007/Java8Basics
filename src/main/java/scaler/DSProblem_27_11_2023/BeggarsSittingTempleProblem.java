package scaler.DSProblem_27_11_2023;

public class BeggarsSittingTempleProblem {
    public static void main(String[] args) {
        int[][] Q = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int N = 5;
        solve(N, Q);
    }
    private static int[] solve(int A, int B[][]){
        int[] ans = new int[A];
        int n = B.length;
        for(int i=0;i<n;i++){
            int start = B[i][0]-1;
            int end = B[i][1]-1;
            int value = B[i][2];
            ans[start] = ans[start]+value;
            if(end+1 < A){
                ans[end+1] = ans[end+1]-value;
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        int len = ans.length;
        int[] psum = new int[len];
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
