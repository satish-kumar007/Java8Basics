package scaler.problems29092023;

public class ArrayCopyOeration {
    public static void main(String[] args) {
        int[] x = {1,2,3,2,1};
        solve(x,3);
    }
    public static int[] solve(final int[] A, int B) {
        int[] result = new int[A.length];
        int i=0;
        for(i=0;i<A.length;i++){
            result[i] = A[i]+B;
        }
        /*System.out.print("[");
        for(int k=0;k<result.length;k++){
            System.out.print(result[k]+",");
        }
        System.out.print("]");*/
        return result;
    }
}
