package scaler.problems180923;

import java.util.Scanner;

public class GetArmstrongTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int count = 0, numA;
        for(int i = 1;i <=num;i++){
            numA=i;
            while(numA > 0) {
                int remainder = numA % 10;
                remainder = remainder * remainder * remainder;
                sum = sum + remainder;
                numA = numA / 10;
            }
            if(sum == i){
                System.out.println(i);
            }
            sum=0;
        }

    }
}
