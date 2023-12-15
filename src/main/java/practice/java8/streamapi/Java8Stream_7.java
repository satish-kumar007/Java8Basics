package practice.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8Stream_7 {
    public static void main(String[] args) {

        //find the max value in given list using stream
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,12,34,56,76,21);
        long max = list.stream().max((o1,o2) -> o1.compareTo(o2)).get();
        System.out.println(max);
        System.out.println("************************************************************");

        //sort the value in given list using stream
        list.stream().sorted().forEach(System.out::println);
        System.out.println("************************************************************");

        //sort the value in given list using stream desc order
        list.stream().sorted((o1,o2) -> -o1.compareTo(o2)).forEach(System.out::println);
        System.out.println("************************************************************");
    }
}
