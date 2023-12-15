package scaler.DSProblem_06_12_2023;

public class PrintNums {
    public static void main(String[] args) {
        solve(9);
    }
    public static void solve(int A) {
        if(A==1){
            System.out.print(A+" ");
            return;
        }
        solve(A-1);
        System.out.print(A+" ");
    }

    public static int fact(int A) {
        if(A==0){
            return 1;
        }
        return fact(A-1)*A;
    }

    public int findAthFibonacci(int A) {
        if(A < 0){
            return A;
        }
        return findAthFibonacci(A-1) + findAthFibonacci(A-2);
    }
}
