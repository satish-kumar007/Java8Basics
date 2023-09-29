package scaler.problems200923;

import java.util.Scanner;

public class NumericStairPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        for(int i=1;i<=numN;i++){
            int x = 1;
            for(int j=1;j<=i;j++){
                if(j == j+x-i){
                    System.out.print(j);
                }else{
                    System.out.print(j+" ");
                }
                x++;
            }
            System.out.println();
        }

        //put space for even number
        /*for(int i=1;i<=numN;i++){
            for(int j=1;j<=i;j++){
                if(j % 2 == 0){
                    System.out.print(" ");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }*/
    }
}
