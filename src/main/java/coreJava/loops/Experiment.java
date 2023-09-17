package coreJava.loops;

import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0){
            System.out.println(0);
        }else{
            while(num != 0){
                if(num < 0){
                    int rem = (num % 10) * -1;
                    System.out.println(rem);
                    num = num / 10;
                }else if(num > 0){
                    int rem = (num % 10);
                    System.out.println(rem);
                    num = num / 10;
                }else{
                    System.out.println(num);
                }
            }
        }

    }
}
