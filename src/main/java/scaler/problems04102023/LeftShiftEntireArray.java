package scaler.problems04102023;

import java.util.Scanner;

public class LeftShiftEntireArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] arr1 = new int[num];
        int temp = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=1;j<arr1.length;j++){
            arr1[j-1] = arr[j];
        }
        temp = arr[0];
        arr1[n-1]=temp;

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
