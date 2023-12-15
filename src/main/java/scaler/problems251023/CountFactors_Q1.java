package scaler.problems251023;

public class CountFactors_Q1 {
    public static void main(String[] args) {
        int count = 0;
        int N = 999999999;
        for(int i=1;i*i<=N;i++){
            if(N%i == 0){
                if(i == N/i){
                    count = count+1;
                }else{
                    count = count+2;
                }
            }
        }
        System.out.println(count);
    }

    public int solve(int A) {
        int count = 0;
        for(int i=1;i*i<=A;i++){
            if(A%i == 0){
                if(i == A/i){
                    count = count+1;
                }else{
                    count = count+2;
                }
            }
        }
        return count;
    }
}
