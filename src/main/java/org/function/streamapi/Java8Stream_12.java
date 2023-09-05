package org.function.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Stream_12 {
    public static void main(String[] args) {
        List<String> nameList_1 = Arrays.asList("Satish","Madhu","Anu","Raj","Seema","Vaanu","Vishu");
        List<String> nameList_2 = Arrays.asList("Shaanu","Srijan","Kaka","Billa","Devi","Ravi","Tichu");
        List<String> nameList_3 = Arrays.asList("Leena","Khoosbu","Sunny","Nooni","Akash","Billi","Saroj");

        //Find all the words started with letter s in all the above list
        List<String> sLetter = Stream.of(nameList_1,nameList_2,nameList_3)
                .flatMap(list -> list.stream())
                .filter(name -> name.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println(sLetter);
    }
}
