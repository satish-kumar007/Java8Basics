package scaler.problems16102023;

import java.util.Scanner;

public class StringLengthProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = null;
        for(int i=0;i<=num;i++){
            str = sc.nextLine();
            System.out.println(str.length());
        }

    }
}
