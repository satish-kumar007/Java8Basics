package scaler.problems200923;

import java.util.Scanner;

public class LeadingSpaceInvertedPatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i, j;
        int numOfSpaces = 2 * num - 2;
        for (i = num; i > 0; i--) {
            for (j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            numOfSpaces = numOfSpaces - 2;
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
