package scaler.practice;

public class RightShiftArray {
    public static void main(String[] args) {
        //move this entire array to left upto one place,
        //Here to notice that last element (2) will be moved to the first position.
        // output: {2,3,4,6,8,9,1,5};
        int[] arr = {3,4,6,8,9,1,5,2};
        int n = arr.length;
        int[] ans = new int[n];

        int temp = arr[n-1];
        for(int i=1;i<n;i++){
            ans[i] = arr[i-1];
        }
        ans[0] = temp;

        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
