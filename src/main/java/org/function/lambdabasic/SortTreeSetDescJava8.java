package org.function.lambdabasic;

import java.util.Set;
import java.util.TreeSet;

public class SortTreeSetDescJava8 {
    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>((o1,o2) -> (o1>o2)?-1:(o1<o2)?1:0);
        integerSet.add(5);
        integerSet.add(8);
        integerSet.add(3);
        integerSet.add(15);
        integerSet.add(18);
        integerSet.add(13);

        System.out.println(integerSet);
    }
}
