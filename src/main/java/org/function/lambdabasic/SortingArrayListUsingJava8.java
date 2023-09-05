package org.function.lambdabasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayListUsingJava8 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(90);
        integers.add(78);
        integers.add(1);
        integers.add(9);
        integers.add(8);
        integers.add(120);
        integers.add(90);
        integers.add(7);
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
        Collections.sort(integers, (o1,o2) -> (o1>o2)?-1:(o1<o2)?1:0);
        System.out.println(integers);
    }
}
