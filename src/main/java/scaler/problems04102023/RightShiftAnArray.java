package scaler.problems04102023;

import java.util.Scanner;

public class RightShiftAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        int[] arr1 = new int[num];
        int n = arr.length;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<arr1.length;i++){
            arr1[i] = arr[i-1];
        }
        int temp = arr[n-1];
        arr1[0] = temp;
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
