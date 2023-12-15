package practice.java8.functioninterface;
/*
Points:
1. Function is same as Predicate except it return any value instead of boolean value
2. Function can take 2 type of arguments here T means input parameter and R means return type.
3. R apply(T t) is the abstract method in Function interface.
 */

import java.util.function.Function;


public class FunctionPredefinedJava8_1 {
    public static void main(String[] args) {
        //Write a program to return the length of a string using Function
        Function<String, Integer> function = (s) -> s.length();
        System.out.println(function.apply("This is a Java Program."));

        //Write a Function to return the square of a given number.
        Function<Double, Double> squareFunction = num -> num*num;
        System.out.println(squareFunction.apply(20.00));

        //Write a Function to remove the whitespaces and return a string
        String str = "Learning Java is a very good experience";
        Function<String, String> trimFunction = string -> string.replaceAll(" ","");
        System.out.println(trimFunction.apply(str));

        //Write a function to count the spaces in a given String
        Function<String, Integer> countFunction = s -> s.length() - s.replaceAll(" ","").length();
        System.out.println(countFunction.apply(str));

    }
}
