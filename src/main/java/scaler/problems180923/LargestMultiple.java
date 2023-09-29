package scaler.problems180923;

import java.util.Scanner;

public class LargestMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = sc.nextInt();
        int multiple = 0;
        if(x == 1){
            System.out.println(num);
        }else{
            for (int i = 1; i <= num/2; i++) {
                multiple = x * i;
                if (num < multiple) {
                    break;
                }
            }
            multiple = multiple-x;
            System.out.println(multiple);
        }
    }
}
