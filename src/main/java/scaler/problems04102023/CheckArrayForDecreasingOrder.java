package scaler.problems04102023;

public class CheckArrayForDecreasingOrder {
    public static void main(String[] args) {
        int []x = {100,90,80,70,60,50,40,30,20,10};
        solve(x);
        int[] y = {80,70,60,60,50,40,30,20};
        solve(y);
    }
    public static int solve(int[] A) {
        int ans = 1;
        for(int i=1;i<A.length;i++){
            if(A[i-1] <= A[i]){
                ans=0;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
