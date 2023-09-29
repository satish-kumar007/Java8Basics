package scaler.problems180923;

import java.util.Scanner;

public class LCMOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int max = 0;
        int ans = 0;

        if(numA < numB){
            max = numB;
        }else{
            max = numA;
        }
        for (int i = max; i <= (numA * numB); i++) {
            if (i % numA == 0 && i % numB == 0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
