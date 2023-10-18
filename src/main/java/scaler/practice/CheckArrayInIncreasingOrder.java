package scaler.practice;
//Check the given array for increasing order
public class CheckArrayInIncreasingOrder {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,1};
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i] < arr[i-1]){
                System.out.println("Not in increasing order");
            }else{
                System.out.println("Array is in increasing order");
            }
        }
    }
}
