package coreJava.loops;

import java.util.Scanner;

public class SumOf3 {
    public static void main(String[] args) {
        int a=10,b=20;
        int c = a/b;
        int d = b/c;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1+num2+num3;
        System.out.println(sum);
    }
}
