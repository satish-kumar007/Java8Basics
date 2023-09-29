package coreJava.loops;

import java.util.Scanner;

public class NumOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int numOfDays=0;
        switch (month){
            case 1:  numOfDays = 31;
                break;
            case 2:  numOfDays = 28;
                break;
            case 3:  numOfDays = 31;
                break;
            case 4:  numOfDays = 30;
                break;
            case 5:  numOfDays = 31;
                break;
            case 6:  numOfDays = 30;
                break;
            case 7:  numOfDays = 31;
                break;
            case 8:  numOfDays = 31;
                break;
            case 9:  numOfDays = 30;
                break;
            case 10: numOfDays = 31;
                break;
            case 11: numOfDays = 30;
                break;
            case 12: numOfDays = 31;
                break;
            default: numOfDays = 0;
                break;
        }
        System.out.println(numOfDays);

    }
}
