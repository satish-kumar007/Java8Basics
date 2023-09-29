package scaler.problems180923;

import java.util.Scanner;

public class GCDOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int min = 0;
        int ans = 0;

        if(numA < numB){
            min = numA;
        }else{
            min = numB;
        }
        for (int i = min; i >= 1; i--) {
            if (numA % i == 0 && numB % i == 0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
