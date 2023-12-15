package practice.java8.lambdabasic;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortingDecJava8 {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new TreeMap<>((o1,o2) -> (o1>o2)?-1:(o1<o2)?1:0);
        stringMap.put(100,"Satish");
        stringMap.put(200,"Anu");
        stringMap.put(400,"Chinny");
        stringMap.put(600,"Luna");
        stringMap.put(500,"Dodo");
        stringMap.put(300,"Gogi");
        System.out.println(stringMap);
    }
}
