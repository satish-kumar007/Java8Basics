package scaler.problems16092023;

import java.util.Scanner;

public class BankDepositWithdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bankBalance = sc.nextLong();
        int numOfOperations = sc.nextInt();

        for(int i=1 ; i<=numOfOperations ; i++) {
            long operationType = sc.nextLong();
            long amount = sc.nextLong();
            if(operationType == 1){
                bankBalance = bankBalance+amount;
                System.out.println(bankBalance);
            }else if(operationType == 2){
                if(bankBalance < amount){
                    //System.out.println(bankBalance);
                    System.out.println("Insufficient Funds");
                }else{
                    bankBalance = bankBalance-amount;
                    System.out.println(bankBalance);
                }
            }else{
                System.out.println("Not a valid operation");
            }
        }
    }
}
