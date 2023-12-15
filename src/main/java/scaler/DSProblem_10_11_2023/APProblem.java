package scaler.DSProblem_10_11_2023;

import java.util.Arrays;

public class APProblem {

    public static int solve(int[] A) {
        int ans = 1;
        int n = A.length;
        Arrays.sort(A);
        int difference = A[1] - A[0];
        for(int i=1;i<n;i++){
            if(A[i] - A[i-1] != difference){
                ans = 0;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x[] = {3, 5, 1};
        int ans = solve(x);
        System.out.println(ans);
    }
}
