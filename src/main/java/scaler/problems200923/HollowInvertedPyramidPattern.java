package scaler.problems200923;

import java.util.Scanner;

public class HollowInvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=1; i<=num; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int s=1; s<=(2*(num-i)); s++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
