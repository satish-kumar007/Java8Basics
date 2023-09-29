package coreJava.loops;

import java.util.Scanner;

public class SummationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 1;
        int sum = 0;
        while(x <= num){
            sum+=x;
            x++;
        }
        System.out.println(sum);

        //Print even from top to down
        int k = 2;
        while(num >= 0){
            if(num % 2 == 0) {
                System.out.print(num + " ");
                num -= k;
            }else{
                System.out.print((num-1) + " ");
                num -= k;
            }
        }
    }
}
