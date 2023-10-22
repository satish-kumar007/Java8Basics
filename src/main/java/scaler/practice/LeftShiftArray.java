package scaler.practice;

public class LeftShiftArray {
    public static void main(String[] args) {
        int[] arr = {3,4,6,8,9,1,5,2}; //output : {4,6,8,9,1,5,2,3}
        int n = arr.length;
        int[] ans = new int[n];
        int temp = arr[0];
        for(int i=1;i<n;i++){
            ans[i-1] = arr[i];
        }
        ans[n-1]= temp;
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
