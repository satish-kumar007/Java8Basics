package scaler.DSProblem_06_11_2023;

public class CountSubArraySumLessThan {

    public static void main(String[] args) {
        int[] x = {2,5,6};
        int z = 10;
        int ans = solve(x,z);
        System.out.println(ans);
    }
    public static int solve(int[] A, int B) {
        int n = A.length;
        int[] psum = prefSum(A);
        int count = 0;
        for(int s=0;s<n;s++){
            long sum = 0;
            for(int e=s;e<n;e++){
                if(s==0){
                    sum = psum[e];
                }else{
                    sum = psum[e] - psum[s-1];
                }
                //System.out.print(sum+" ");
                if(sum < B){
                    count++;
                }
            }
        }
        return count;
    }

    public static int[] prefSum(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1]+arr[i];
        }
        return ans;
    }
}
