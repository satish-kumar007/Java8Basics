package scaler.DSProblem_29_11_2023;

public class FindKInMatrix {
    public static void main(String[] args) {
        int [][]A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int B = 2;
        solve(A,B);
    }
    public static int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        int i=0,j=m-1, ans=-1;
        while(i<n && j>=0){
            if(A[i][j] < B){
                i++;
            }else if(A[i][j] > B){
                j--;
            }else{
                for(int k = j ; k >= 0 ; k--){
                    if(A[i][k] == B){
                        ans = ((i + 1) * 1009 + (k + 1));
                    }
                }
                break;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
