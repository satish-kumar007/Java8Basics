package scaler.problems13102023;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueElementsInRows {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(A.size());
        for(int i=0;i<A.size();i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < A.get(i).size(); j++) {
                int element = A.get(i).get(j);
                list.add(element);
            }
            ArrayList<Integer> un = getUniqueElements(list);
            ans.add(un);
        }
        System.out.println(ans);
        return ans;
    }
    public static ArrayList<Integer> getUniqueElements(ArrayList<Integer> list){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int j=0;j<list.size();j++){
            int element = list.get(j);
            int frequency = 0;
            for(int k=0;k<list.size();k++){
                if(list.get(k).equals(element)){
                    frequency++;
                }
            }
            if(frequency == 1){
                ans.add(element);
            }
        }
        System.out.println(ans);
        return ans;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> inlist = new ArrayList<>();
        inlist.add(2);
        inlist.add(1);
        //inlist.add(2);

        ArrayList<Integer> inlist2 = new ArrayList<>();
        inlist2.add(2);
        inlist2.add(4);
        //inlist2.add(4);
        list.add(inlist);
        list.add(inlist2);
        //System.out.println(list);
        solve(list);
    }
}
