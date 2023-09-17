package scaler.problems16092023;

import java.util.Scanner;

public class OddEvenDigitSumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        int remainder = 0;

        while(num != 0){
            remainder = num % 10;
            if(remainder%2 == 0){
                sumEven = sumEven+remainder;
                num = num/10;
            }else{
                sumOdd = sumOdd + remainder;
                num = num/10;
            }
        }
        System.out.println("Sum of Odd Digit :"+sumOdd);
        System.out.println("Sum of Even Digit :"+sumEven);
    }
}
