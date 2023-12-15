package scaler.DSProblem_17_11_2023;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            int n = sc.nextInt();
            int ans = 0;
            int count = 0;
            while (n != 0) {
                int rem = n % 2;
                double c = Math.pow(10, count);
                ans += rem * c;
                n /= 2;
                count++;
            }
            String binary = String.valueOf(ans);
            System.out.println(binary);
        }
    }
}
