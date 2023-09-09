package coreJava.loops;

import java.util.Scanner;

public class BankProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        int operation = sc.nextInt();
        double amount_2 = sc.nextDouble();

        if(operation == 1){
            System.out.println(amount+amount_2);
        }else if(operation == 2){
            if(amount < amount_2){
                System.out.println("Insufficient Funds");
            }else{
                System.out.println(amount - amount_2);
            }
        }
    }
}
