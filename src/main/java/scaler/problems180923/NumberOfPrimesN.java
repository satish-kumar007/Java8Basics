package scaler.problems180923;

import java.util.Scanner;

public class NumberOfPrimesN {
    public static void main(String[] args) {
        //Count primes
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter;
        int numOfPrimes = 0;
        int i,j = 0;

        for(j=2;j<=num;j++){
            counter=0;
            for(i=1;i<=j;i++){
                if(j % i == 0){
                    counter++;
                }
            }
            if(counter == 2)
                numOfPrimes++;
                System.out.print(j+" ");
            }
        System.out.println();
        System.out.println(numOfPrimes);
    }
}
