package scaler.problems200923;

import java.util.Scanner;

public class PrintNStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print("*");
        }
    }
}
