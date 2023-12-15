package scaler.DSProblem_10_11_2023;

import java.util.Arrays;

public class NobleIntegerProblem {

    public static void main(String[] args) {
        int x[] ={1, 2, 3, 3};
        int ans = solve(x);
        System.out.println(ans);
    }
    public static int solve(int[] A) {
        int n = A.length;
        int ans = -1;
        Arrays.sort(A);
        int []rev = reverse(A);
        int count=0;
        for(int i=0;i<n;i++){
            if(rev[i] == i){
                ans = 1;
            }
        }


        /*for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(A[j] > A[i]){
                    count++;
                }
            }
            if(A[i] == count){
                ans = 1;
            }
        }*/
        return ans;
    }

    public static int[] reverse(int[] A) {
        int n =A.length;
        int ans[]  = new int[n];
        int s=0, e = n-1;
        while(s<n){
            int temp = A[s];
            ans[s] = A[e];
            ans[e] = temp;
            s++;
            e--;
        }
        return ans;
    }
}
