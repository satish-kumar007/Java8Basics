package coreJava.loops;

import java.util.Scanner;

public class ReveseInAVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int copy = num;

        if(num < 0){
            num = num * -1;
        }

        while(num > 0){
            int d = (num % 10);
            rev = (rev * 10) + d;
            num = num/10;
        }

        if(copy < 0){
            rev = rev * -1;
        }
        System.out.println(rev);
    }
}
