package scaler.problems200923;

import java.util.Scanner;

public class InvertedNumericPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=num;i>=1;i--){
            int x=1;
            for(int j=1;j<=i;j++){
                if(j==j+x-i){
                    System.out.print(j);
                }else{
                    System.out.print(j+" ");
                }
                x++;
            }
            System.out.println();
        }
    }
}
