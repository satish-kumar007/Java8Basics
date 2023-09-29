package scaler.problems180923;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTablePro {
    public static void main(String[] args) {
        Map<Long, String> map = new Hashtable<>();
        map.put(7042529175L, "Satish Kumar");
        map.put(7042529176L, "Satish Kumar");
        //map.put(null, "Satish Kumar");//java.lang.NullPointerException
        //map.put(7042529176L, null);//java.lang.NullPointerException
        System.out.println(map);

        Map<Long, String> mapTree = new TreeMap<>();
        mapTree.put(7042529175L, "Satish Kumar");
        mapTree.put(7042529176L, "Satish Kumar");
        map.put(null, "Satish Kumar");//java.lang.NullPointerException
        //mapTree.put(7042529176L, null);//Ok
        System.out.println(mapTree);
    }
}
