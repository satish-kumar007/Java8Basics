package org.function.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Collect() method collect the elements from the stream and adding them to specified collection
 */
//Program to collect the elements have length >=9 in the list
public class Java8Stream_3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Pawan");
        al.add("RaviTeja");
        al.add("Chranjeevi");
        al.add("Venkatesh");
        al.add("Nagarjuna");
        al.add("SS Rajamoli");
        System.out.println(al);

        List<String> ll = al.stream().filter(i -> i.length()>=9).collect(Collectors.toList());
        System.out.println(ll);

        //Get all elements in uppercase
        List<String> l2 = al.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(l2);

        //Count the elements have length >=9
        Long count = al.stream().filter(s -> s.length()>=9).count();
        System.out.println(count);

        //Get sorted elements default ASC
        List<String> l3 = al.stream().map(s -> s.toLowerCase()).sorted().collect(Collectors.toList());
        System.out.println(l3);

        //Get sorted elements DES
        List<String> l4 = al.stream().map(s -> s.toLowerCase()).sorted((o1,o2) -> -o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(l4);
    }
}
