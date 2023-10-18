package scaler.problems13102023;

import java.util.ArrayList;

public class PrintStairCaseUsingArrayList {
    public static void main(String[] args) {
        solve(5);
    }
    public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=A;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=1;j<=i;j++){
               list.add(j);
            }
            ans.add(list);
        }
        System.out.println(ans);
        return ans;
    }
}
