package practice.java8.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Satish");
        str.add("Rashmika");
        str.add("Sunny");
        str.add("Sheetal");
        str.add("Aashutosh");
        List<Integer> collect = str.stream().map(name -> name.length()).collect(Collectors.toList());
        collect.forEach(System.out::println);
        Optional<Integer> first = collect.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println(first);
        //
    }
}
