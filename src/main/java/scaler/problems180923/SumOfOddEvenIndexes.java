package scaler.problems180923;

import java.util.Scanner;

public class SumOfOddEvenIndexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 1;
        int sumEven = 0;
        int sumOdd = 0;
        while(num != 0){
            int remainder = num % 10;

            if(counter % 2 == 1){
                sumOdd = sumOdd+remainder;
            }else if(counter % 2 == 0){
                sumEven = sumEven+remainder;
            }
            num = num/10;
            counter++;
        }
        System.out.println("Sum of Odd Index Digit : "+sumOdd);
        System.out.println("Sum of Even Index Digit : "+sumEven);
    }
}
