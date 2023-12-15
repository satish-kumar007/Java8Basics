package scaler.DSProblem_06_11_2023;

import java.util.ArrayList;

public class SubArrayGetSubArrayFromRange {
    public static void main(String[] args) {
        int[] x = {3,4,5,6,7,8,1,3,9,3};
        int s = 4;
        int e = 7;
        getSubarrayFromRange(x,s,e);
        System.out.println();
    }

    public static ArrayList<Integer> getSubarrayFromRange(ArrayList<Integer> A, int B, int C){
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=B;i<=C;i++){
           ans.add(A.get(i));
        }
        return ans;
    }
    public static void getSubarrayFromRange(int[] arr, int s, int e){
        int n = arr.length;
        for(int i=s;i<=e;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//TC: O(N)
//SC: O(1)
