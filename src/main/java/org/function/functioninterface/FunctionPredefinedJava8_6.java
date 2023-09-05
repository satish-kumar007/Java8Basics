package org.function.functioninterface;

import java.util.Scanner;
import java.util.function.Function;

/*
Authentication example using function
username: aryana0707
password: java
 */
public class FunctionPredefinedJava8_6 {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        System.out.println("Enter username");
        String username = scanner.next();

        System.out.println("Enter password");
        String password = scanner.next();

        Function<String,String> function1 = s -> s.substring(0,5);
        Function<String, String> function2 = s -> s.toLowerCase();

        if(function1.andThen(function2).apply(username).equals("aryana0707") && password.equals("java")){
            System.out.println("Valid user");
        }else{
            System.out.println("Invalid user");
        }
    }
}
