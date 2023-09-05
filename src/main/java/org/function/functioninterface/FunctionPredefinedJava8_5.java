package org.function.functioninterface;
/*
Function Chaining
Point 1: joining 2 functions with each other for a specific task
f1 & f2
f1.andThen(f2) --> join 2 function to form a complex function - Here first F1 will apply followed by f2
f1.compose(f2) -->  apply f2 followed by f1
 */

import java.util.function.Function;

public class FunctionPredefinedJava8_5 {
    public static void main(String[] args) {
        Function<String, String> func = s -> s.toUpperCase();
        Function<String, String> func2 = s -> s.substring(0,9);
        System.out.println(func.apply("SatishKumarSingh"));
        System.out.println(func2.apply("SatishKumarSingh"));
        System.out.println(func.andThen(func2).apply("SatishKumarSingh"));//first convert into uppercase and then select 9 char
        System.out.println(func.compose(func2).apply("SatishKumarSingh"));//first select 9 character then convert into uppercase
    }
}
