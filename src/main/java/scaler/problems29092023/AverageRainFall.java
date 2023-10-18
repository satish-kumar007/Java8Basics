package scaler.problems29092023;

import java.util.Scanner;

/** Create an array of size N, which can store rainfall size for N days.
 Take rainfall measurement for N days from user and print floor of average rainfall for N days.
 */
public class AverageRainFall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        double average = 0.0;
        int ans = 0;
        for(int i=0;i<num;i++){
            int[] arr = new int[num];
            arr[i] = sc.nextInt();
            sum = sum +arr[i];
        }
        average = sum/num;
        ans = (int)Math.floor(average);
        System.out.println(ans);
    }
}
