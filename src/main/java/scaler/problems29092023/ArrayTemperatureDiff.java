package scaler.problems29092023;

import java.util.Scanner;
/*Create an array of size N, which can store temperature for N days.
Take temperature for N days from user and print Value of Max - Min.
 */
public class ArrayTemperatureDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxTemp=Integer.MIN_VALUE;
        int minTemp = Integer.MAX_VALUE;
        int num = sc.nextInt();
        for(int i =0;i<num;i++){
            int[] arr = new int[num];
            arr[i] = sc.nextInt();
            if(arr[i] > maxTemp){
                maxTemp = arr[i];
            }
            if(arr[i] < minTemp){
                minTemp = arr[i];
            }
        }
        System.out.println(minTemp+"   "+maxTemp);
        System.out.println(maxTemp - minTemp);
    }
}
