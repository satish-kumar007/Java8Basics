package practice.java8.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;


public class Java8Stream_6 {
    public static void main(String[] args) {
        //Stream program to get even number from a list
        List<Integer> li = Arrays.asList(5,2,3,6,8,9,1,2,5);
        li.stream().filter(i -> i%2==0).forEach(System.out::println);
        System.out.println("=============================================================");

        //Program to find all the numbers starting from 1, here it is to notice that integer list has been converted to string using map()
        List<Integer> list = Arrays.asList(12,34,56,78,123,45,126);
        list.stream().map(s -> s+"").filter(s -> s.startsWith("1")).forEach(System.out::println);
        System.out.println("=============================================================");

        //Program to find the duplicate elements in a list using stream
        List<Integer> li2 = Arrays.asList(5,2,3,6,8,9,1,2,5);
        Set<Integer> set = new HashSet<>();
        li2.stream().filter(s -> !set.add(s)).forEach(System.out::println);
        System.out.println("=============================================================");

        //Find the first element of the list
        List<Integer> li3 = Arrays.asList(5,2,3,6,8,9,1,2,5);
        li3.stream().findFirst().ifPresent(System.out::println);
        System.out.println("=============================================================");

        //Find the total number of elements in the list
        List<Integer> li4 = Arrays.asList(5,2,3,6,8,9,1,2,5);
        long count = li4.stream().count();
        System.out.println(count);
        System.out.println("=============================================================");

    }
}
