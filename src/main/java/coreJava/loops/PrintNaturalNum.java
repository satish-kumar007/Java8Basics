package coreJava.loops;

import java.util.Scanner;

public class PrintNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            System.out.print(i+" ");
        }
    }
}