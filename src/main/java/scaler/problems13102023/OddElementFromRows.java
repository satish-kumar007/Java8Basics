package scaler.problems13102023;

import java.util.ArrayList;

public class OddElementFromRows {
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
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(A.size());
        for(int i=0;i<A.size();i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < A.get(i).size(); j++) {
                if(A.get(i).get(j) % 2 == 1 || A.get(i).get(j) % 2 == -1){
                    list.add(A.get(i).get(j));
                }
            }
            ans.add(list);
        }
        System.out.println(ans);
        return ans;
    }
}
