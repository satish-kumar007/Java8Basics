package org.function.predicateinterface;

import java.util.function.Predicate;

//isEqual method of Predicate
public class PredicateFunctionalInterface_8 {
    public static void main(String[] args) {
        Predicate<String> testEqual = Predicate.isEqual("Satish");
        System.out.println(testEqual.test("Satish"));
        System.out.println(testEqual.test("Reeta"));
    }
}
