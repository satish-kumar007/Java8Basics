package scaler.problems06102023;

import java.util.ArrayList;

public class FoundAllIndicesInnArray {
    public static void main(String[] args) {
        int[] x ={1, 3, 2, 4, 2, 5, 2};
        solve(x,2);
    }
    public static int[] solve(int[] A, int B) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            int indices = 0;
            if(A[i] == B){
                indices = i;
                list.add(indices);
            }
        }
        int[] resultArr = new int[list.size()];
        for(int i=0;i<resultArr.length;i++){
            resultArr[i] = list.get(i);
        }
        return resultArr;
    }
}
