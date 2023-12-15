package scaler.DSProblem_03_11_2023;

public class CarryForwardFindLeaderLeft {
    public static void main(String[] args) {
        int[] x = {4,2,3,9,7,10};
        int ans[] = solve(x);
        for(Integer z : ans){
            System.out.print(z+" ");
        }
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        int max = A[0];
        int count = 1;
        int[] ans = new int[n];
        ans[0] = A[0];
        for(int i=1;i<n;i++){
            if(A[i] > max){
                count++;
                max = A[i];
            }
            ans[i] = max;
        }
        System.out.println(count);
        return ans;
    }
}
