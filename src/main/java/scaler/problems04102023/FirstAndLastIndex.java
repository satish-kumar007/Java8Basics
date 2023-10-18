package scaler.problems04102023;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
Given a sorted integer array A, and an integer B. Find the first and last index of B in A.
It is guaranteed that B exists in A. Return an array C of size 2, where C[0] is the first index of B in A and C[1] is the last index of B in A.

Note: Indexing of A starts from 0. If the element only exists once, the values of both elements in the C list should be the same.
 */
public class FirstAndLastIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(1);
        list.add(3);
        solve(list, 3);
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ansList = new ArrayList<>();
        int firstIndex = 0;
        int lastIndex = 0;
        for(int i = 0;i<A.size();i++){
            int x = A.get(i);
            if(x == B){
                firstIndex = A.indexOf(x);
                lastIndex = A.lastIndexOf(x);
            }
        }
        ansList.add(firstIndex);
        ansList.add(lastIndex);

        return ansList;
    }
}
