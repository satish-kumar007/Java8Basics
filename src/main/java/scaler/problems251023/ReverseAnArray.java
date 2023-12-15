package scaler.problems251023;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        int[] ans = solve(x);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] solve(final int[] A) {
        int n = A.length;
        int s = 0;
        int e = n-1;
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
