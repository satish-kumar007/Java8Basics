package scaler.DSProblem_03_11_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarryForwardFindLeaderRight {
    public static void main(String[] args) {
        Integer[] x = {16, 17, 4, 3, 5, 2,45,67,89,12,45,67,12,5,7,0,1,45,7,23};
//        int ans[] = solve(x);
//        for(Integer z : ans){
//            System.out.print(z+" ");
//        }

        List<Integer> arrList = Arrays.asList(x);
        ArrayList<Integer> l = solve(arrList);
        l.stream().forEach(System.out::println);
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        int max = A[n-1];
        int count = 1;
        int[] ans = new int[n];
        ans[n-1] = A[n-1];
        for(int i=n-2;i>=0;i--){
            if(A[i] > max){
                count++;
                max = A[i];
            }
            ans[i] = max;
        }
        System.out.println(count);
        return ans;
    }

    //Using List
    public static ArrayList<Integer> solve(List<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        System.out.println(A.size());
        int max = A.get(A.size()-1);
        System.out.println(max);
        ans.add(max);
        for(int i=A.size()-2;i>=0;i--){
            int element = A.get(i);
            if(element > max){
                max = element;
                //System.out.println("==="+max);
                ans.add(max);
            }
        }
        System.out.println(ans);
        return ans;
    }
}
