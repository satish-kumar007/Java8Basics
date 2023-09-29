package scaler.problems22092023;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        int ans=1;
        if(numN == 0){
            ans = 1;
        }
        for(int i=1;i<=numN;i++){
            ans = ans * i;
        }
        System.out.println(ans);
    }
}
