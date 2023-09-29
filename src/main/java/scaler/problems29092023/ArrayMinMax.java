package scaler.problems29092023;

import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        getMinMax();
    }

    public static void getMinMax(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<num;i++) {
            int[] arr = new int[num];
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(max+" "+min);
    }
}
