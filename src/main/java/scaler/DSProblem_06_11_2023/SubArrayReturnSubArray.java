package scaler.DSProblem_06_11_2023;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayReturnSubArray {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            int n = A.size();
            for(int s=0;s<n;s++){
                for(int e=s;e<n;e++){
                    ArrayList<Integer> list = new ArrayList<>();
                    for(int k=s;k<=e;k++){
                        System.out.print(A.get(k)+" ");
                        list.add(A.get(k));
                    }
                    ans.add(list);
                    System.out.println();
                }
            }
            System.out.println(ans);
            return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(36);list.add(63);list.add(63);
        list.add(26);list.add(87);list.add(28);
        list.add(77);list.add(93);list.add(7);
        solve(list);

    }
}
