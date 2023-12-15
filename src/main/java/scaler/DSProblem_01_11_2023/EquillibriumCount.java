package scaler.DSProblem_01_11_2023;

public class EquillibriumCount {
    public static void main(String[] args) {
        int []x = {-7, 1, 5, 2, -4, 3, 0};
        int ans = solve(x);
        System.out.println(ans);
    }
    public static int solve(int[] A) {
        int[] ps = prefSum(A);
        int n = A.length;
        int index=-1;
        for(int i=0;i<n;i++){
            int ls = 0;
            if(i != 0){
                ls = ps[i-1];
            }
            int rs = ps[n-1] - ps[i];
            if(ls == rs){
                index = i;
                break;
            }
        }
        return index;
    }
    public static  int[] prefSum(int[] A){
        int n = A.length;
        int []ans = new int[n];
        ans[0] = A[0];
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1] + A[i];
        }
        return ans;
    }
}
