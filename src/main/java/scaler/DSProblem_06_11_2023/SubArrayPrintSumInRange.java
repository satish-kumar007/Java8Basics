package scaler.DSProblem_06_11_2023;

public class SubArrayPrintSumInRange {
    public static void main(String[] args) {
        int[] arr = {4,6,8,1,2,4,6,9,3};
        int n = arr.length;
        int s = 3;
        int sum = 0;
        for(int e=s;e<n;e++){
            sum = sum+arr[e];
            System.out.print(sum+" ");
        }
    }
}
