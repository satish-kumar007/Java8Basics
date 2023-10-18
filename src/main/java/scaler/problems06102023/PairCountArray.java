package scaler.problems06102023;
/*
You are given an integer array A and an integer B.

You are required to return the count of pairs having sum equal to B.

NOTE: pair (i,j) and (j,i) are same.
 */
public class PairCountArray {
    public static void main(String[] args) {
        int []x = {41, 25, 36, 10, 9, 85, 45, 68, 74, 90};
        solve(x,100);
    }
    public static int solve(int[] A, int B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        int counter=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i] + A[j] == B){
                    counter++;
                }
            }
        }

        return counter;
    }
}
