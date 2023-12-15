package geeksOfgeeks.Arrays;

public class InsertElementAtMid {
    public static void main(String[] args) {
        int[] arr = {4,5,6,2,7,8,9,1,4,2};
        int elementToInsert = 90;//This is the element that we want to insert
        int n = arr.length;
        int pos = n/2;
        int index = pos-1;
        int[] ans = new int[n+1];//output array created whose size will be n+1, n is size of original array
        for(int i=0;i<index;i++){
            ans[i] = arr[i];//First loop storing element of actual array upto index position into output array
        }
        for(int i=index;i<n;i++){
            ans[i+1] = arr[i];//skipping insert position and putting all element in output array
        }
        ans[index] = elementToInsert;//store element in the desired position.

        System.out.print("Actual Array :: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Output Array :: ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
