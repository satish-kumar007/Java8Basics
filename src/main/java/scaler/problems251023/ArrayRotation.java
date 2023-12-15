package scaler.problems251023;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        int[] ans = solve(x,10);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] solve(int[] A, int B) {
        int n = A.length;
        B = B % n;
        solve(A,0,n-1);
        solve(A,0,B-1);
        solve(A,B,n-1);
        return A;
    }
    public static int[] solve(int[] A, int B, int C) {
        int n = A.length;
        int s = B;
        int e = C;
        while(s<e){
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
        return A;
    }
}
