package practice.java8.streamapi;

import java.util.ArrayList;
import java.util.List;

/*
To get the min/max value the list should be sorted first
 */
public class Java8Stream_4 {
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        i.add(3);    i.add(6);       i.add(45);
        i.add(32);   i.add(12);      i.add(7);
        i.add(8);    i.add(10);

        Integer min = i.stream().min((o1,o2) -> o1.compareTo(o2)).get();
        System.out.println(min);

        Integer max = i.stream().max((o1,o2) -> o1.compareTo(o2)).get();
        System.out.println(max);
    }
}
