package scaler.DSProblem_10_11_2023;

import java.util.Arrays;

public class RemoveElementsCost {
    public static void main(String[] args) {
        int[] x = {7,8,3,2,1,5,7,4};
        Arrays.sort(x);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        int ans[]  = reverse(x);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    public int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int []rev = reverse(A);
        int sum =0;
        for(int i=0;i<n;i++){
            sum=sum+rev[i]*(i+1);
        }
        return sum;
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
