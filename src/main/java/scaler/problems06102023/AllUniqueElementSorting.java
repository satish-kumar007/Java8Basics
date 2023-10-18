package scaler.problems06102023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllUniqueElementSorting {
    public static void main(String[] args) {
        int[] x = {1,2,4,3,6,8,9,12,45,67,1,89,0};
        solve(x);
    }
    public static int[] solve(int[] A) {
        List<Integer> list = new ArrayList<>();
        int n = A.length;
        for(int i=0;i<n;i++){
            int elements = A[i];
            int freq = 0;
            list.add(elements);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int j=0;j<n;j++){
            int element = list.get(j);
            int frequency = 0;
            for(int k=0;k<n;k++){
                if(list.get(k).equals(element)){
                    frequency++;
                }
            }
            if(frequency == 1){
                ans.add(element);
            }
        }
        Collections.sort(ans);
        int[] a = new int[ans.size()];
        for(int i=0;i<a.length;i++){
            a[i] = ans.get(i);
        }
        return a;

    }
}
