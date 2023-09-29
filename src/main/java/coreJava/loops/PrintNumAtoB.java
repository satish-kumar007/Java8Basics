package coreJava.loops;

import java.util.Scanner;

public class PrintNumAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        for(int i=num;i<=num2;i++){
            System.out.print(i+" ");
        }
    }
}
