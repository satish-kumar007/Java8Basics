package geeksOfgeeks.problemsolving;

import java.util.ArrayList;

public class ReverseArrayInGroups {

   static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
       ArrayList<Integer> list = new ArrayList<>();

       for(int i=0;i<k;i++){
           int start = arr.get(i);
           int end = list.get(k-1);
           int temp = start;
           start = end;
           end = temp;

       }
    }
}
