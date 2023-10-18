package scaler.problems29092023;

import java.util.Scanner;

/**
 * Write a program to print the input array A of size N in reverse order where you have to
 * take integer N and further N elements as input from user.
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] reverse = new int[num];
        int k = 0;
        for(int i=0;i<num;i++) {
            arr[i] = sc.nextInt();
        }
        for(k = arr.length-1;k>=0;k--){
            System.out.print(arr[k]+" ");
        }
    }
}
