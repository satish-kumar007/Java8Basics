package scaler.problems29092023;
/*
Given an integer array A. Find and return the frequency of number B in array A.
 */
public class ArrayCheckFrequency {
    public static void main(String[] args) {
        int[] x = {2,4,5,6,7,8,9,2,3,4,2,9,0,1};
        int frequency = solve(x,2);
        System.out.println(frequency);
    }
    public static int solve(int[] A, int B) {
        int counter = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] == B){ // this is need to remember, this is the check point
                counter++;
            }
        }
        return counter;
    }
}
