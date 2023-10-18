package scaler.practice;

public class InsertAnElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9,12,34,67};
        int position = 6;
        int n = arr.length;
        //Suppose we want to insert new element on 6th position
        //here index will be position  - 1, we will take ans array also, who has size arr.length + 1;
        int index = position -1;
        int[] ans = new int[n+1];

        //first iteration
        for(int i=0;i<index;i++){
            ans[i] = arr[i];
        }
        for(int i = index;i<n;i++){
            ans[i+1] = arr[i];
        }
        ans[index] = 26;

        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
