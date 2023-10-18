package scaler.problems06102023;

import java.util.ArrayList;
import java.util.Collections;

public class PrimeNumList {
    public static void main(String[] args) {
        int[] x = {131, 23, 14, 19, 7, 2, 21, 1, 28, 11};
        solve(x);
    }
    public static int[] solve(int[] A) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<A.length; i++){
            if(A[i] == 1){
                continue;
            }else{
                boolean isPrime = true;
                for (int j=2; j<A[i]; j++){
                    if(A[i]%j==0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    list.add(A[i]);
                }
            }

        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorted :: "+list);
        int[] resultArr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            resultArr[i] = list.get(i);
        }
        return resultArr;
    }
}
