package scaler.problems29092023;

/*Given an array A[] and an element B.
Return Count of element which are greater than B.
 */
public class CountElementGreaterThanB {
    public static void main(String[] args) {
        int[] arr = {12, 26 ,25 ,21 ,18, 10 ,45, 40, 29, 30};
        solve(arr,25);
    }
    public static int solve(int[] A, int B) {
        int counter = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] > B){
                counter++;
            }
        }
        return counter;
    }
}
