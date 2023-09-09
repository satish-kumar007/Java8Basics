package coreJava.loops;

import java.util.Scanner;

public class ProblemOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 0){
            if(num % 2 == 1){
                System.out.println("Odd-Positive");
            }else if(num % 2 == 0){
                System.out.println("Even-Positive");
            }
        }else if(num < 0){
            if(num % 2 == -1){
                System.out.println("Odd-Negative");
            }else if(num % 2 == 0){
                System.out.println("Even-Negative");
            }
        }
    }
}
