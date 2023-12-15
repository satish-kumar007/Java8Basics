package scaler.DSProblemPracticeFor_24_11_2023;

public class ReverseArrayBasedOnRange {
    public static void main(String[] args) {
        int[] x = {3,5,-8,1,5,8,2,0,4};
        int[] ans = getReverseArray(x,2,6);
        for(Integer in : ans){
            System.out.print(in+" ");
        }
    }

    public static int[] getReverseArray(int[] A, int s, int e){
        int n = A.length;
        while(s < e){
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
        return A;
    }
}
