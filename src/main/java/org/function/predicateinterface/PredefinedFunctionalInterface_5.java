package org.function.predicateinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Prgram to remove null and empty string from an array/List
public class PredefinedFunctionalInterface_5 {
    public static void main(String[] args) {
        String[] str = {"this", "is", "a", null ,"an" ,"value","", "i", "can", null, "to",""};
        Predicate<String> removeNulls = s -> s!=null &&  s!="";
        List<String> list = new ArrayList<>();
        for (String ss : str){
            if(removeNulls.test(ss)){
                list.add(ss);
            }
        }
        System.out.println(list);
    }
}
