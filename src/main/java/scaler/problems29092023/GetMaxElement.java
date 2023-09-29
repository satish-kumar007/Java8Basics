package scaler.problems29092023;

public class GetMaxElement {
    public static void main(String[] args) {
        //int arr[] = new int[10];
        int max = Integer.MIN_VALUE;
        int[] arr = {12,13,5,6,7,8,9,1,2,3,78,12};
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
               max = arr[i];

            }
        }
        System.out.println(max);
    }
}
