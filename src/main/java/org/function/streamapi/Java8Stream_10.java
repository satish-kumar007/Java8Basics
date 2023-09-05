package org.function.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8Stream_10 {
    public static void main(String[] args) {
        //Concat 2 streams using java 8
        List<String> l1 = Arrays.asList("Sita","Ram","Laxman","Arjuna","Karana");
        List<String> l2 = Arrays.asList("Hanuman","Duryodhna","Bheem","Krishna","Karana");
        Stream<String> s1 = Stream.concat(l1.stream(),l2.stream());
        s1.forEach(System.out::println);

        System.out.println("************************************************************");

        //Java program to perform qube on list and filternumbers greater than 50
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9);
        numbers.stream().map(num -> num*num*num).filter(num -> num>=50).forEach(System.out::println);

        //Program to sort an array and then convert sorted array into stream
        int[] arr = {2,3,5,9,6,4,0,1};
        Arrays.parallelSort(arr);
        Arrays.stream(arr).forEach(System.out::println);

        //Convert into uppercase
        List<String> str = Arrays.asList("this","is","java","programming","java 8");
        str.stream().map(s -> s.toUpperCase()).forEach(System.out::println);


    }
}
