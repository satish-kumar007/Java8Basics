package scaler.problems06102023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicEvenArray {
    public static void main(String[] args) {
        int[] x = {1,2,4,3,6,8,9,12,45,67,1,89,0};
        solve(x);
    }
    public static int[] solve(int[] A) {
        List<Integer> list = new ArrayList<>();
        int n = A.length;
        for(int i=0;i<n;i++){
            int elements = A[i];
            if(elements % 2 ==0){
                list.add(elements);
            }
        }
        System.out.println(list);
        int[] a = new int[list.size()];
        for(int i=0;i<a.length;i++){
            a[i] = list.get(i);
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        return a;

    }

}
