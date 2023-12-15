package scaler.DSProblem_17_11_2023;

public class BinaryToDecimalConversion {
    public static void main(String[] args) {
        int n = 10000;
        int ans = 0;
        int mul = 1;
        while(n>0){
            int rem = n%10;
            n = n/10;
            ans = ans +(rem*mul);
            mul = mul*2;
        }
        System.out.println(ans);
    }
}
