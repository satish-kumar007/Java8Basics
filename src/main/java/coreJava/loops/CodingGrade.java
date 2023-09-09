package coreJava.loops;

import java.util.Scanner;

public class CodingGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rating = sc.nextInt();
        if(rating >= 2100){
            if(rating % 2 ==0)
                System.out.println("grand master".toUpperCase());
            else
                System.out.println("grand master".toLowerCase());
        }else if(rating >= 1900){
            if(rating % 2 ==0)
                System.out.println("candidate master".toUpperCase());
            else
                System.out.println("candidate master".toLowerCase());
        }else if(rating >= 1600){
            if(rating % 2 ==0)
                System.out.println("expert".toUpperCase());
            else
                System.out.println("expert".toLowerCase());
        }else if(rating >= 1400){
            if(rating % 2 ==0)
                System.out.println("pupil".toUpperCase());
            else
                System.out.println("pupil".toLowerCase());
        }else{
            if(rating % 2 ==0)
                System.out.println("newbie".toUpperCase());
            else
                System.out.println("newbie".toLowerCase());
        }
    }
}
