package scaler.problems13102023;

import java.util.ArrayList;

public class MultipleOfEachElement {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        A.add(2);A.add(5);A.add(9);A.add(3);A.add(8);
        ArrayList<Integer> B = new ArrayList<>();
        B.add(3);B.add(2);
        solve(A,B);
    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(A.size());
        for(int i=0;i<B.size();i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < A.size(); j++) {
                if(A.get(j) % B.get(i) == 0){
                    list.add(A.get(j));
                }
            }
            ans.add(list);
        }
        System.out.println(ans);
        return ans;
    }
}
