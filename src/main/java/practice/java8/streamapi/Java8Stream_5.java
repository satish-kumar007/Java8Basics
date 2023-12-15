package practice.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
toArray method is used to copy the elements specified in streams to an array
Stream.of() -> method not only deals with collection, but it also deals with arrays, group of values, sequence on numbers, things also
 */
public class Java8Stream_5 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(20);l.add(10);l.add(5);l.add(30);l.add(50);l.add(60);
        l.add(2);l.add(1);l.add(9);l.add(78);l.add(7);l.add(120);
        System.out.println(l);

        //Convert stream into an array
        Integer[] arr = l.stream().toArray(Integer[] :: new);
        for(Integer i : arr){
            System.out.print(i+"\t");
        }
        System.out.println();
        //Stream.of()
        Stream<Integer> s = Stream.of(9,99,999,9999,99999,999999);
        s.forEach(System.out :: println);

        Integer[] arr1 = {1,2,3,4,5,6,7,8,9};
        Stream<Integer> s2 = Stream.of(arr1);
        s2.forEach(System.out :: println);
    }
}
