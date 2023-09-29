package scaler.problems29092023;

import java.util.Scanner;

public class ArraySumOfElements {
    public static void main(String[] args) {
        getSumOfArray();
    }
    public static int getSumOfArray(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=0;i<num;i++){
            int[] arr = new int[num];
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(sum);
        return sum;
    }
}
