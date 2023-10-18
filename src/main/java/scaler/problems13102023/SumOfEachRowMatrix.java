package scaler.problems13102023;

import java.util.ArrayList;

public class SumOfEachRowMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> inlist = new ArrayList<>();
        inlist.add(2);
        inlist.add(1);
        inlist.add(2);

        ArrayList<Integer> inlist2 = new ArrayList<>();
        inlist2.add(2);
        inlist2.add(3);
        inlist2.add(7);
        list.add(inlist);
        list.add(inlist2);
        //System.out.println(list);
        solve(list);
    }
    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> sumList = new ArrayList<>();
        for(int i=0;i<A.size();i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int j = 0; j < A.get(i).size(); j++) {
                sum = sum + A.get(i).get(j);
            }
            sumList.add(sum);
        }
        for(int i=0;i<A.get(0).size();i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int j = 0; j < A.size(); j++) {
                sum = sum + A.get(j).get(i);
            }
            sumList.add(sum);
        }
        System.out.println(sumList);
        return sumList;
    }
}
