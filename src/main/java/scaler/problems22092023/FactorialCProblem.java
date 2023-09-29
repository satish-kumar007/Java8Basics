package scaler.problems22092023;

import java.util.Scanner;

public class FactorialCProblem {
    public static void main(String[] args) {
        System.out.println(Math.ceil(-4.0));
        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        int val1=1;
        int val2 = 1;
        if(numN == 0){
            val1 = 1;
        }
        for(int i=1;i<=numN;i++){
            val1 = val1 * i;
        }

        for(int i=1;i<=numN;i++){
            val2 = val2 * i;
        }

    }
}
