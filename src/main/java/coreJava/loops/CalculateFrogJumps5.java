package coreJava.loops;

import java.util.Scanner;

public class CalculateFrogJumps5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stepCount = 5;
        int currentPos = sc.nextInt();
        int jumpSize = sc.nextInt();

        while(stepCount >= 1){
            currentPos+=jumpSize;
            System.out.print(currentPos+" ");
            stepCount--;
        }

    }
}
