package org.function.predicateinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredefinedFunctionalInterface_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(3);
        list.add(2);
        list.add(12);
        list.add(52);
        list.add(72);

        Predicate<List> listPredicate = l -> l.isEmpty();
        boolean checkList = listPredicate.test(list);
        System.out.println(checkList);

        List<Integer> list1 = new ArrayList<>();
        Predicate<List> listPredicate1 = l -> l.isEmpty();
        boolean checkList1= listPredicate1.test(list1);
        System.out.println(checkList1);

        Predicate<List> listPredicate2 = l -> l.contains(12);
        boolean checkList2= listPredicate2.test(list);
        System.out.println(checkList2);

    }
}
