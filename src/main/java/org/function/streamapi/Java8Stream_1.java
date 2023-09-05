package org.function.streamapi;
/*
Point 1: Stream in io package and Stream API not the same.
2. Stream API avaiable to Collection only, if we want to perform operations on collections, Stream API is used
3. You can say Stream is used to Process the data from collections.
4. Collections vs Streams--> Collection is a group of entities whereas if we want to process the objects from collections, stream will use.
 */

//Program to filter out even elements from an existing list
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Stream_1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(10);
        al.add(20);

        al.add(5);
        al.add(15);
        al.add(25);
        System.out.println(al);
        //Previous approach
        List<Integer> l1 = new ArrayList<>();
        for(Integer i : al){
            if(i%2==0){
                l1.add(i);
            }
        }
        System.out.println(l1);

        //Using stream
        List<Integer> l2 = al.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(l2);

        //Double each element of the list
        List<Integer> l3 = al.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println(l3);
    }
}
