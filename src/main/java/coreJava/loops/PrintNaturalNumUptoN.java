package coreJava.loops;

import java.util.Scanner;

public class PrintNaturalNumUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while(i <= num){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        // top to down
       /* while(num >= 1){
            System.out.print(num+" ");
            num--;
        }*/
        System.out.println();
        //print all even
        int k = 2;
        while(k <= num){
            System.out.print(k+" ");
            k=k+2;
        }

    }
}
