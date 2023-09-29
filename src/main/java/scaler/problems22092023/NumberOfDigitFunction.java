package scaler.problems22092023;

public class NumberOfDigitFunction {
    public static int solve(int A) {
        int ans = 0;
        int counter = 0;
        int copy = A;
        if (A < 0) {
            A = A * -1;
        }
        while (A != 0) {
            int rem = A % 10;
            counter++;
            A = A / 10;
        }
        System.out.println(counter);
        return counter;
    }

    public static void main(String[] args) {
        solve(-1);
    }
}
