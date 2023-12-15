package scaler.DSProblem_03_11_2023;

public class CarryForwardBuyShellStocks {
    public static void main(String[] args) {
        int[] x = {1, 4, 5, 2, 4};
        int z = solve(x);
        System.out.println(z);
    }
    public static int solve(int[] A) {
        int n = A.length;
        int ans = 0;
        if(n > 0) {
            int BSP = A[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                int profit = BSP - A[i];
                if (A[i] > BSP) {
                    BSP = A[i];
                }
                if (profit > ans) {
                    ans = profit;
                }
            }
        }
        return ans;
    }
}
