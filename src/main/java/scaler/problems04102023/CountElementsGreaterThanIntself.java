package scaler.problems04102023;
/*
Given an array A of N integers.
Count the number of elements that have at least 1 elements greater than itself.
 */
public class CountElementsGreaterThanIntself {
    public static void main(String[] args) {
        int[] x ={7,4,2,10,5};
        solve(x);
    }
    public static int solve(int[] A) {
        int counter = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i] != max){
                counter++;
            }
        }
        return counter;
    }
}
