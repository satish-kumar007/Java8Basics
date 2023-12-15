package scaler.DSProblem_01_11_2023;

public class PrefixSumInRange {
    public static void main(String[] args) {
        int[] x = {2,5,7,8,9,1,7,8};
        int[][] y = {{0, 3},{1, 2}};
        long[] range = rangeSum(x,y);
        for(int i =0;i<range.length;i++){
            System.out.print(range[i]+" ");
        }


        System.out.println();
        int[] ans = prefixSumArray(x);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] prefixSumArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1]+arr[i];
        }
        return ans;
    }

    public static long[] rangeSum(int[] A, int[][] B) {
        int prefixSum[] = prefixSumArray(A);
        int n = B.length;
        long []ans = new long[n];
        for(int i = 0;i<n;i++){
            int L = B[i][0];
            int R = B[i][1];
            int sum = 0;
            if(L != 0){
                sum = prefixSum[R]-prefixSum[L-1];
            }else{
                sum = prefixSum[R];
            }
            ans[i] = sum;
        }
        return ans;
    }
}
