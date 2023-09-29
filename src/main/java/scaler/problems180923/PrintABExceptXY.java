package scaler.problems180923;

import java.util.Scanner;

public class PrintABExceptXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numX = sc.nextInt();
        int numY = sc.nextInt();

        for(int i=numA;i<=numB;i++){
            if(i == numX || i == numY){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
