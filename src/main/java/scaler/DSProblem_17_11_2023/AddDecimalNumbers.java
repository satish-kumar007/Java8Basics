package scaler.DSProblem_17_11_2023;

public class AddDecimalNumbers {
    public static void main(String[] args) {

        int ans =0,mul=1, carry=0;
        int num1 = 78;
        int num2 = 10;
        while(num1 > 0 || num2 > 0 || carry > 0){
            int d1 = num1%10;
            int d2 = num2%10;
            num1 = num1/10;
            num2 = num2/10;
            int sum = d1+d2+carry;
            int rem = sum%10;
            ans = ans +(rem*mul);
            mul = mul*10;
        }
        System.out.println(ans);
    }
}
