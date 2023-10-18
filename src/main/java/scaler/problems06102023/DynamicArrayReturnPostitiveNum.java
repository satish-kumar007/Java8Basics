package scaler.problems06102023;

import java.util.ArrayList;

public class DynamicArrayReturnPostitiveNum {
    public static void main(String[] args) {
        int[] x = {-99, 4,-2,-3,6, 70, -8, 14};
        solve(x);
    }
    public static int[] solve(int[] A) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            if(A[i] >= 0){
                list.add(A[i]);
            }
        }
        //System.out.println(list);
        int[] resultArr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            resultArr[i] = list.get(i);
        }
        return resultArr;
    }
}
