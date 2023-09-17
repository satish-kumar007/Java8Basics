package scaler.problems16092023;

import java.util.Scanner;

public class SinglePalindromNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int original = num;
        int copy = num;

        if(num < 0){
            num = num * -1;
        }
        while(num != 0){
            int remainder = 0;
            remainder = num % 10;
            rev = (rev * 10) +remainder;
            num = num / 10;
        }
        if(copy < 0){
            rev = rev * -1;
        }
        if(original == rev){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
