package scaler.DSProblem_01_12_2023;

import java.util.Arrays;

public class FindMissingNumber {
    public int firstMissingPositive(int[] A) {
        int n = A.length;
        int count = 1;
        Arrays.sort(A);
        for(int i=0;i<n;i++){
            if(count==A[i]){
                count++;
            }
        }
        return count;
    }
}
