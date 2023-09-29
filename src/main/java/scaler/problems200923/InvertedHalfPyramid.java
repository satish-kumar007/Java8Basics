package scaler.problems200923;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        for(int i=1;i<=numN;i++){
            for(int j=numN;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
