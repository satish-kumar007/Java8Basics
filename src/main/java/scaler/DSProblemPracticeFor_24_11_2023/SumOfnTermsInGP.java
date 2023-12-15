package scaler.DSProblemPracticeFor_24_11_2023;

public class SumOfnTermsInGP {
    public static void main(String[] args) {
        int[] gp = {2,6,18,54,162};
        int n = gp.length;
        int a = 2;
        double ratio = gp[1]/gp[0];
        int minus = (int)ratio-1;
        int ratioPower = (int)Math.pow(ratio,n);
        int sum = (a * (ratioPower - 1))/minus;
        System.out.println(minus);
        System.out.println(sum);
    }
}
