package geeksOfgeeks.Arrays;

public class InsertElementStartPos {
    public static void main(String[] args) {
        int[] arr = {4,5,6,2,7,8,9,1,4,2};
        int elementToInsert = 90;//This is the element that we want to insert
        int n = arr.length;
        int[] ans = new int[n+1];//output array created whose size will be n+1, n is size of original array
        for(int i =1;i<=n;i++){//important: loop needs to start from 1 and should end upto n
            ans[i] = arr[i-1];//Because we started the loop from 1 , ans array 2nd element will be first element of actual array
        }
        ans[0] = elementToInsert;// insert element in the first position

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
