package scaler.practice;

import java.util.Scanner;

public class ReturnCountOfEven {
    public static void main(String[] args) {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        for(int i=1;i<=5;i++){
            int x = sc.nextInt();
            if(x % 2 ==0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
