package scaler.DSProblem_01_11_2023;

public class CountEvenNumInRange {
    public static void main(String[] args) {
        int x[] = {3,5,8,9,16,14,13,12};

        int[] even = countEven(x);
        for(int i =0;i<even.length;i++){
            System.out.print(even[i]+" ");
        }
    }

    public int[] solve(int[] A, int[][] B) {
        int n = B.length;
        int[] pref = countEven(A);
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int L = B[i][0];
            int R = B[i][1];
            if(L != 0){
                ans[i] = pref[R] - pref[L-1];
            }else{
                ans[i] = pref[R];
            }
        }
        return ans;
    }

    public static int[] countEven(int[] A){
        int n = A.length;
        int[] countEvenPref = new int[n];
        //countEvenPref[0] = A[0];
        if(A[0] % 2 == 0){
            countEvenPref[0] = 1;
        }else{
            countEvenPref[0] = 0;
        }
        for(int i=1;i<n;i++){
            if(A[i] % 2 == 0){
                countEvenPref[i] = countEvenPref[i-1]+1;
            }else{
                countEvenPref[i] = countEvenPref[i-1];
            }
        }
        return countEvenPref;
    }
}
