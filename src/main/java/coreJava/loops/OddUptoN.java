package coreJava.loops;

import java.util.Scanner;

public class OddUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 1;
        /*while(x<=num){
            System.out.print(x+" ");
            x+=2;
        }
        System.out.println();*/
        //SUM of odds
        int sum = 0;
        while(x <= num){
            sum = sum+x;
            x+=2;
        }
        System.out.println(sum);
    }
}
