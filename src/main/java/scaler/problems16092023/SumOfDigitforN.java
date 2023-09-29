package scaler.problems16092023;

import java.util.Scanner;

public class SumOfDigitforN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        for(int i=0 ; i<num ; i++){
            int moreNumbers = sc.nextInt();
            int sum = 0;
            while(moreNumbers > 0){
                sum = sum + (moreNumbers % 10);
                moreNumbers = moreNumbers/10;
            }
            System.out.println(sum);
        }
    }
}
