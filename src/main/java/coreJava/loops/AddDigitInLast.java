package coreJava.loops;

import java.util.Scanner;

public class AddDigitInLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();
        int newNum = 0;
        if(num != 0){
            newNum = num * 10 + digit;
            System.out.println(newNum);
        }else{
            System.out.println();
        }

    }
}
