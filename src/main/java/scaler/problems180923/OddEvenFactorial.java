package scaler.problems180923;

import java.util.Scanner;

public class OddEvenFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 0;
        for(int i=1;i<=num;i++){
            if(num % i == 0){
                //System.out.print(i+" ");
                counter++;
            }
        }
        System.out.println(counter);
    }
}
