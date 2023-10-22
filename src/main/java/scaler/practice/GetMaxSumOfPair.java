package scaler.practice;

public class GetMaxSumOfPair {
    public static void main(String[] args) {
        int[] arr = {5,4,8,3,2,12};
        int maxSum = Integer.MIN_VALUE;
        int index1=0;
        int index2 = 0;
        for(int i=1;i<arr.length;i++){
            int sum = 0;
            sum = arr[i]+arr[i-1];
            //System.out.println(sum);
            if(sum > maxSum) {
                maxSum = sum;
                index1 = i - 1;
                index2 = i;
            }
        }
        System.out.println(maxSum+ "    "+index1+ "  "+index2);
    }
}
