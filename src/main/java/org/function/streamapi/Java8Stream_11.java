package org.function.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Stream_11 {
    public static void main(String[] args) {
        //program to count the appearance of an elements in a list
        List<String> names = Arrays.asList("satish","here","words","there","satish","here");
        Map<String,Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        //program to fetch the duplicate elements
        Map<String,Long> ele = names.stream().filter(x -> Collections.frequency(names,x) >1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ele);

        //print the count of char of a string
        String str = "I love to learn java programming language.";
        Map<String, Long> s = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(a -> a, LinkedHashMap::new, Collectors.counting()));
        System.out.println(s);
    }
}
