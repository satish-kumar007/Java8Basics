package scaler.problems06102023;
/*
You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .
 */
public class FrequencyCountInArray {
    public static void main(String[] args) {
        int[] x = {1, 2, 5, 1, 5, 1};//result : 3, 1, 2, 3, 2, 3
        solve(x);
    }
    public static int[] solve(int[] A) {
        int[] resultArr = new int[A.length];
        for(int i=0;i<A.length;i++){
            int frequency = 0;
            for(int j=0;j<A.length;j++){
                if(A[i] == A[j]){
                    frequency++;
                }
            }
            resultArr[i] = frequency;
        }
        return resultArr;
    }
}
