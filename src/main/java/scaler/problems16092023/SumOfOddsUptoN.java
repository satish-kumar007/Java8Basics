package scaler.problems16092023;

import java.util.Scanner;

public class SumOfOddsUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumOdd = 0;

        for(int i=1 ; i<=num ; i+=2) {
            sumOdd = sumOdd+i;
        }
        System.out.println(sumOdd);
    }
}
