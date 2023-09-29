package scaler.problems200923;

import java.util.Scanner;

public class HollowPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=1; i<=num; i++) {
            for(int j=1; j<=(num+1-i); j++) {
                System.out.print("* ");
            }
            for(int s=1; s<=(2*(i-1)); s++) {
                System.out.print("  ");
            }
            for(int j=1; j<=(num+1-i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
