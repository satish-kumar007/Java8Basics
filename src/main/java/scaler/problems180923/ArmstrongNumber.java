package scaler.problems180923;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int sum = 0;
        while(num != 0){
            int remainder = num % 10;
            remainder = remainder * remainder * remainder;
            sum = sum+remainder;
            num = num/10;
        }
        System.out.println(sum +"  "+original);
        if(original == sum){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }

    }
}
