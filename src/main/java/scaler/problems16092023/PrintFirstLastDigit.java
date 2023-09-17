package scaler.problems16092023;

import java.util.Scanner;

public class PrintFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        for(int i=1;i<=num1;i++){
            int num = sc.nextInt();
            int copy = num;
            int lastDigit = 0;
            int firstDigit = 0;
            if(num < 0){
                num = num * -1;
            }
            lastDigit = num % 10;
            while(num >= 10){
                num = num / 10;
            }
            System.out.println(num+" "+lastDigit);
        }
    }
}
