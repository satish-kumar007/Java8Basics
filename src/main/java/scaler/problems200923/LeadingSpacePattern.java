package scaler.problems200923;

import java.util.Scanner;

public class LeadingSpacePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i, j;
        for (i = num; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
