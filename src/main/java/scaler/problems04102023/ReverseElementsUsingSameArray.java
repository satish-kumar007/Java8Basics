package scaler.problems04102023;
/*
Given an integer array A of size N , return the reverse of it in a new array.
Make sure that the original array is not changed.

Note: The intention of this problem is to teach you, how to make a new array and return from the function.
 */
public class ReverseElementsUsingSameArray {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6};
        solve(x);
    }
    public static int[] solve(int[] A) {
        int n = A.length;
        int pointer1 = 0;
        int pointer2 = n-1;
        while(pointer1 < pointer2){
            int temp = A[pointer1];
            A[pointer1] = A[pointer2];
            A[pointer2] = temp;
            pointer1++;
            pointer2--;
        }
        for(int i = 0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        return A;
    }
}
