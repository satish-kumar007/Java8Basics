package coreJava.loops;

import java.util.Scanner;

public class ComplexIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 10 && num < 20){
            int num2 = sc.nextInt();
            if((num +num2) >= 100){
                System.out.println(num +num2);
                System.out.println("That is a large sum!");
            }else{
                System.out.println(num +num2);
            }
        }else{
            System.out.println(-1);
        }
    }
}
