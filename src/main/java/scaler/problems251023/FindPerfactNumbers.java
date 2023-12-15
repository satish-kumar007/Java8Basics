package scaler.problems251023;

public class FindPerfactNumbers {
    public static void main(String[] args) {
        int x = solve(4);
        System.out.println(x);
    }
    public static int solve(int A) {
        int ans = 0;
        int sum = 0;
        for(int i=1;i<A;i++){
            if(A%i == 0){
                sum = sum+i;
            }
        }
        if(sum == A){
          ans = 1;
        }
        return ans;
    }
}
