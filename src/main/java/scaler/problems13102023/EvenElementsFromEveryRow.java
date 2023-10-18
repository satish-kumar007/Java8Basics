package scaler.problems13102023;

import java.util.ArrayList;

public class EvenElementsFromEveryRow {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(A.size());
        for(int i=0;i<A.size();i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<A.get(0).size();j++){
                if(A.get(i).get(j) % 2 ==0){
                    list.add(A.get(i).get(j));
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
