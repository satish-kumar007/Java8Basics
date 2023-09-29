package coreJava.loops;

import java.util.Scanner;

public class GradeComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int sum = sub1+sub2+sub3+sub4+sub5;
        double percentage = (sum/500.0) * 100 ;

        if(percentage >= 90){
            System.out.println((int) percentage);
            System.out.println("A");
        }else if(percentage >= 80 && percentage < 90){
            System.out.println((int) percentage);
            System.out.println("B");
        }else if(percentage >= 70 && percentage < 80){
            System.out.println((int) percentage);
            System.out.println("C");
        }else if(percentage >= 60 && percentage < 70){
            System.out.println((int) percentage);
            System.out.println("D");
        }else if(percentage >= 40 && percentage < 60){
            System.out.println((int) percentage);
            System.out.println("E");
        }else{
            System.out.println((int) percentage);
            System.out.println("F");
        }


    }
}
