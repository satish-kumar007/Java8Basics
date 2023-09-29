package scaler.problems180923;

import java.util.Scanner;

public class SmallestMultipleOfXAToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numX = sc.nextInt();
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int ans=0;
        for(int i=1;i<=numB;i++){
            int x = numX*i;
            System.out.println(numX+" "+numA+" "+numB);
            if((x > numA) && (x < numB)){
                ans = x;
                break;
            }
        }
        System.out.println(ans);

    }
}
