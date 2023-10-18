package scaler.problems200923;

import java.util.Scanner;

public class StairPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        for(int i=1;i<=numN;i++){
            for(int j=1;j<=i;j++){
                if(j == j+1-i){
                    System.out.print(j);
                }else
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
