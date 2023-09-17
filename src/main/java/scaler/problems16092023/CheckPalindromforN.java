package scaler.problems16092023;

import java.util.Scanner;

public class CheckPalindromforN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0 ; i<num ; i++) {
            int moreNumbers = sc.nextInt();
            int original = moreNumbers;
            int rev = 0;
            int copy = moreNumbers;

            if(moreNumbers < 0){
                moreNumbers = moreNumbers * -1;
            }
            while(moreNumbers > 0){
                int d = (moreNumbers % 10);
                rev = (rev * 10) + d;
                moreNumbers = moreNumbers/10;
            }
            if(copy < 0){
                rev = rev * -1;
            }
            if(original == rev){
                System.out.println("Palindromic");
            }else{
                System.out.println("Not Palindromic");
            }
        }
    }
}
