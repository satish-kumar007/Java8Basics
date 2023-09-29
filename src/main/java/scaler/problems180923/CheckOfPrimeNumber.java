package scaler.problems180923;

import java.util.Scanner;

public class CheckOfPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 0;

        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                counter++;
            }
            if(counter > 2)
                break;
        }
        if(counter != 2){
            System.out.println("Composite Number");
        }else{
            System.out.println("Prime Number");
        }
    }
}
