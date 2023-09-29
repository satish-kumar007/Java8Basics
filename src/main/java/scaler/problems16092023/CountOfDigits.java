package scaler.problems16092023;

import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1 ; i<=num ; i++) {
            int moreNumber = sc.nextInt();
            int counter = 0;
            if(moreNumber == 0){
                counter = 1;
            }
            while(moreNumber != 0){
                int remainder = moreNumber%10;
                counter++;
                moreNumber = moreNumber/10;
            }
            System.out.println(counter);
        }
    }
}
