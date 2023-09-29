package scaler.problems16092023;

import java.util.Scanner;

public class SumOfDigitsofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0 ; i<num ; i++) {
            int sum = 0;
            int remainder = 0;
            int moreNumbers = sc.nextInt();
            while(moreNumbers != 0){
                remainder = moreNumbers % 10;
                sum = sum+remainder;
                moreNumbers = moreNumbers/10;
            }
            System.out.println(sum);
        }
    }
}
