package scaler.problems29092023;

public class ArrayGetMin {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int[] arr = {23,45,6,7,8,9,0,1,234,5,67,-8};
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
