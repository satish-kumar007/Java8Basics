package practice.java8.functioninterface;

import java.util.function.Function;

//identity function of Function interface
public class FunctionPredefinedJava8_7 {
    public static void main(String[] args) {
        Function<String, String> function = Function.identity();
        System.out.println(function.apply("Satish"));
    }
}
