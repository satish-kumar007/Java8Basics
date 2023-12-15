package scaler.DSProblem_01_11_2023;

public class GoodSubArrayProblem {

    public static void main(String[] args) {
        int[] x = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int z = 65;
        int ans = solve(x,z);
        System.out.println(ans);
    }
    public static int solve(int[] A, int B) {
        int n = A.length;
        int[] psum = prefSum(A);
        int count = 0;
        for(int s=0;s<n;s++){

            for(int e=s;e<n;e++){
                int countLength = e - s + 1;
                long sum = 0;
                //System.out.println(s+" ::  "+e);
                if(s==0){
                    sum = psum[e];
                }else{
                    sum = psum[e] - psum[s-1];
                }
                //System.out.print(sum+" ");
                if(countLength % 2 == 0 && sum < B)count++;
                if(countLength % 2 == 1 && sum > B)count++;
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
