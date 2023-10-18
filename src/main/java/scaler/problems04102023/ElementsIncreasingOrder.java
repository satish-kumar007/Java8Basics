package scaler.problems04102023;

import java.util.Scanner;
//Create an array of size N that store elements in increasing order.
public class ElementsIncreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = i+1;
            System.out.print(arr[i]+" ");
        }
    }
}
