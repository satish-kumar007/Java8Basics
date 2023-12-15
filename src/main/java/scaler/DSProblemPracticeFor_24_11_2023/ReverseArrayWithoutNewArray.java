package scaler.DSProblemPracticeFor_24_11_2023;

public class ReverseArrayWithoutNewArray {
    public static void main(String[] args) {
        int[] x = {3,5,-8,1,5,8,2,0,4};
        int[] ans = getReverseArray(x);
        for(Integer in : ans){
            System.out.print(in+" ");
        }
    }
    public static int[] getReverseArray(int[] A){
        int n = A.length;
        int p1 = 0;
        int p2 = n-1;
        while(p1<p2){
            int temp = A[p1];
            A[p1] = A[p2];
            A[p2] = temp;
            p1++;
            p2--;
        }
        return A;
    }
}
