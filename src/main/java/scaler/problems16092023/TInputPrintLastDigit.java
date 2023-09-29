package scaler.problems16092023;

import java.util.Scanner;

public class TInputPrintLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0 ; i<num ; i++){
            int moreNumbers = sc.nextInt();
            System.out.println(moreNumbers % 10);
        }
    }
}
