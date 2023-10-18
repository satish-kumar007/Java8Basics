package scaler.practice;

public class CheckArrayInDecreasingOrder {
    public static void main(String[] args) {
        int[] arr = {9, 8, 6, 3, 1};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.println("Not in decreasing order");
            } else {
                System.out.println("Array is in decreasing order");
            }
        }
    }
}
