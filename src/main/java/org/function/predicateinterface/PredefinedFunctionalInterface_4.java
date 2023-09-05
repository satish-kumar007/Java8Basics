package org.function.predicateinterface;

import java.util.function.Predicate;

/*
Points:

 */
//Program to display the name starts with K
public class PredefinedFunctionalInterface_4 {
    public static void main(String[] args) {
        String[] names = {"Sunny", "Kajal","Katrina","Kareena","Malika","Kunti"};
        Predicate<String> predicate = str -> str.charAt(0)=='K';
        for(String name : names){
            if(predicate.test(name))
                System.out.println(name);
        }
    }
}
