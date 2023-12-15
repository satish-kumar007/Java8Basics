package scaler.DSProblem_08_11_2023;

public class CheckRandSum {

    public static void main(String[] args) {
        int[] x = {4, 3, 2, 6, 1};
//        int B=3;
//        int C=11;

        int[] A = {4, 2, 2, 5, 1};
        int B = 4;
        int C = 6;
        System.out.println(solve(A,B,C));
    }
    public static int solve(int[] A, int B, int C) {
        int n = A.length;
        int ans = 0;
        int s=0;int e=B-1;
        while(e<n){
            long sum = 0;
            for(int i=s;i<=e;i++){
                sum = sum+A[i];
            }
            if(sum == C){
                ans = 1;
                break;
            }
            s++; e++;
        }
        return ans;
    }
}
