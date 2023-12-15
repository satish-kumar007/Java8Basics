package practice.java8.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Stream_8 {
    public static void main(String[] args) {

        //Program to return the status in case duplicate
        int[] arr = {2,4,6,8,9,0,1};
        System.out.println(new Java8Stream_8().containDuplicate(arr));
        System.out.println("****************************************************");

        int[] arr1 = {2,4,6,8,9,0,1, 2};
        System.out.println(new Java8Stream_8().containDuplicate(arr1));
    }
    public boolean containDuplicate(int[] arr){
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);
        if(set.size() == list.size()){
            return false;
        }
        return true;
    }

}
