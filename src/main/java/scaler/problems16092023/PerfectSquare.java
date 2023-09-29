package scaler.problems16092023;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int perfectSquare = 1;
        for(int i=1;i<=num;i++){
            perfectSquare = i * i;
            if(perfectSquare <= num){
                System.out.println(perfectSquare);
            }
        }
    }
}
