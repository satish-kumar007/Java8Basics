package org.function.predicateinterface;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateOddEven {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i%2==0;
        boolean b = predicate.test(15);
        System.out.println(b);

        Stream.of(13).filter(i -> i%2==0).forEach(System.out::println);
    }
}
