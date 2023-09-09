package coreJava.loops;

import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numOfClasses = sc.nextDouble();
        double numOfAttendedClasses = sc.nextDouble();
        System.out.println(numOfClasses+" numOfClasses");
        System.out.println(numOfAttendedClasses+" numOfAttendedClasses");
        double attendance = (numOfAttendedClasses/numOfClasses) * 100;
        System.out.println(attendance);
        if(attendance >= 75){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
