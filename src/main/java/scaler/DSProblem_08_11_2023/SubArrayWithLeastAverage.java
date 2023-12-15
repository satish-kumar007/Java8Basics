package scaler.DSProblem_08_11_2023;

public class SubArrayWithLeastAverage {
    public static void main(String[] args) {
        int[] x = {15,7,11,7,9,8,18,1,16,18,6,1,1,4,18};
        int B=6;
        System.out.println(solve(x,B));
    }
    public static long solve(int[] A, int B) {
        int n = A.length;
        int index = 0;
        int current_sum = 0;
        for(int i=0;i<B;i++){
            current_sum = current_sum+A[i];
        }
        int minSum = current_sum;
        for(int i=B;i<n;i++){
            current_sum = current_sum + A[i] - A[i-B];
            System.out.println("======="+current_sum);
            if(current_sum < minSum){

                index = (i-B+1);
                System.out.println("***** "+index);
            }
            minSum = current_sum;
        }
        return index;
    }
}
