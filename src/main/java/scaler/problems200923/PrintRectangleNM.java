package scaler.problems200923;

import java.util.Scanner;

public class PrintRectangleNM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        int numM = scanner.nextInt();
        for(int i=1;i<=numN;i++){
            for(int j=1;j<=numM;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
