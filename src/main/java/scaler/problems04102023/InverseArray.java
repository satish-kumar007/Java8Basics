package scaler.problems04102023;

public class InverseArray {
    public static void main(String[] args) {
        int[] c = {2,1,0};
        solve(c);
    }
    public static int[] solve(int[] A) {
        int [] arr = new int[A.length];
        for(int i=0;i<A.length;i++){
            int val = A[i];
            arr[val] = i;
            System.out.print(arr[val]+" ");
        }
        return arr;
    }
}
