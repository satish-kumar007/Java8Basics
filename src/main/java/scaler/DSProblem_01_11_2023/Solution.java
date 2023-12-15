package scaler.DSProblem_01_11_2023;

public class Solution {
    public static void main(String[] args) {
        int[] x = {16,3,3,6,7,8,17,13,7};
        int[][] y = {{0,2},{1,4}};
        System.out.println();
        int[] ans = solve(x,y);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int[] pref = new int[n];
        pref[0] = A[0];
        for(int i = 1 ; i < n ; i++){
            if(i % 2 == 0){
                pref[i] = pref[i - 1] + A[i];
            }
            else{
                pref[i] = pref[i - 1];
            }
        }
        return pref;
    }
}
