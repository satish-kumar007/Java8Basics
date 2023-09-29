package scaler.problems180923;

import java.util.Scanner;

public class CalculateStepsDivideBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int counter=0;
        for(int i=num;i>=1;i--){
            num = num/2;
            counter++;
            if(num == 1){
                break;
            }
        }
        System.out.println(counter);
    }
}
