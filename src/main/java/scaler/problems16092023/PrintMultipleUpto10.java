package scaler.problems16092023;

import java.util.Scanner;

public class PrintMultipleUpto10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0 ; i<num ; i++) {
            int moreNumbers = sc.nextInt();
            for(int k=1;k<=10;k++){
                System.out.print(k*moreNumbers+" ");
            }
            System.out.println();
        }
    }
}
