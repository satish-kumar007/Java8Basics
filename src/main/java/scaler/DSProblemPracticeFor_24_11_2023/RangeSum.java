package scaler.DSProblemPracticeFor_24_11_2023;

public class RangeSum {
    public static void main(String[] args) {
        int []x = {3,4,5,6,7,8,9};
        System.out.println("{3,4,5,6,7,8,9}");
        int y[][] = {{0,0},{0,1},{1,2},{2,3},{3,4},{4,5},{5,6}};
        rangeSum(x,y);
        System.out.println();
        prefSum(x);
        System.out.println();
        prefixSumArray(x);

    }
    public static void rangeSum(int[] arr, int[][] range){
     //Ordinary way to get range sum, note to that 2 for loop queries
        int n = arr.length;
        int c = range[0].length;
        int row = range.length;
        for(int i=0;i<row;i++){
            int sum = 0;
            int left = range[i][0];
            int right = range[i][1];
            for(int j =left;j<=right;j++){
                sum = sum+arr[j];
            }
            System.out.print(sum+" ");
        }
    }

    public static int[] prefSum(int[] arr){
        //Optimized way to get range sum, note to that 1 for loop queries
        int n = arr.length;
        int sum = 0;
        int ans[] = new int[n];
        ans[0] = arr[0];
        for(int i=1;i<n;i++){
            ans[i] = arr[i-1]+arr[i];
        }
        return ans;
    }

    public static int[] prefixSumArray(int[] arr){
        //Prefix sum
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1]+arr[i]; // note to that previous ans array element added to the first one
        }
        return ans;
    }
}
