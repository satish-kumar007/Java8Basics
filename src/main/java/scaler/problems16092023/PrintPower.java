package scaler.problems16092023;

import java.util.Scanner;

public class PrintPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int pow = 1;
        for(int i = 1;i<=num2;i++){
            pow = pow * num;
        }
        System.out.println(pow);
    }
}
