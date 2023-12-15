package scaler.DSProblem_27_11_2023;

public class KadaneAlgoMaxSumSubArray {
    public static void main(String[] args) {
        int[] x = {4,5,2,1,6};
        int z = solve(x);
        System.out.println(z);
    }
    public static int solve(int[] arr){
        int n = arr.length;
        int ans = arr[0]; // should be initialized with first element of arr
        int sum = arr[0]; // should be initialized with first element of arr
        for(int i=1;i<n;i++){
            if(sum<0){
                sum = 0;
            }
            sum = sum + arr[i];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
