package scaler.DSProblemPracticeFor_24_11_2023.prefixsum;

public class EquillibriumIndexes {
    public static void main(String[] args) {
        int[] x = {0,1,1,3,2};
        prefixSumArray(x);
        int count = getIndex(x);
        System.out.println();
        System.out.println("Count of Equilibrium Indexes :: "+count);
    }
    public static int getIndex(int[] arr){
        int n = arr.length;
        int[] psum = prefixSumArray(arr);
        int count = 0;
        for(int i=0;i<n;i++){
            int leftSum=0;
            int rightSum=0;
            if(i > 0){
                leftSum = psum[i-1];
            }
            rightSum = psum[n-1] - psum[i];
            if(leftSum == rightSum){
                System.out.print("Equilibrium Element :: "+arr[i]+" ");
                count++;
            }
        }
        return count;
    }

    public static int[] prefixSumArray(int[] arr){
        int n = arr.length;
        int[] psum = new int[n];
        psum[0] = arr[0];
        for(int i=1;i<n;i++){
            psum[i] = psum[i-1]+arr[i];
        }
        for(Integer i : psum){
            System.out.print(i+" ");
        }
        System.out.println();
        return psum;
    }
}
