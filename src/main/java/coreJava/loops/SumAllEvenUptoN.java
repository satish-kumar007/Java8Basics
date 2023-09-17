package coreJava.loops;

import java.util.Scanner;

public class SumAllEvenUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 2;
        int sum = 0;
        while(x <= num){
            sum = sum+x;
            x+=2;
        }
        System.out.println(sum);
    }
}
