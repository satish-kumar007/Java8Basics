package scaler.problems200923;

import java.util.Scanner;

public class NumOfSpacesPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        int j=1;
        for(int i=1;i<=numN;i++){
            System.out.print("*");
            for(j=1;j<=numN-2;j++){
               System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
