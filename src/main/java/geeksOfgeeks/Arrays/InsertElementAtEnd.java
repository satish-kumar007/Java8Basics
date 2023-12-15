package geeksOfgeeks.Arrays;

public class InsertElementAtEnd {
    public static void main(String[] args) {
        int[] arr = {4,5,6,2,7,8,9,1,4,2};
        int elementToInsert = 90;//This is the element that we want to insert
        int n = arr.length;
        int[] ans = new int[n+1];//output array created whose size will be n+1, n is size of original array
        for(int i=0;i<n;i++){
            ans[i] = arr[i];//storing arr array elements in output array
        }
        ans[ans.length-1] = elementToInsert;//storing the last element in the output array.
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
