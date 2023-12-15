package scaler.DSProblem_06_11_2023;

import java.util.Scanner;

public class SubArrayPrintSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        for(int s=0;s<n;s++){
            for(int e=s;e<n;e++){
                for(int k=s;k<=e;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
