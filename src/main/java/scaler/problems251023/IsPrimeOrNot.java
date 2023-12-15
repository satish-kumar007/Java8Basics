package scaler.problems251023;

public class IsPrimeOrNot {
    public static void main(String[] args) {
        System.out.println(solve(5));
    }
    public static int solve(int A) {
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
        if(count == 2){
            return 1;
        }
        return 0;
    }
}
