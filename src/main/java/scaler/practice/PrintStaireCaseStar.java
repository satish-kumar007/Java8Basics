package scaler.practice;

import java.util.Scanner;

public class PrintStaireCaseStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //Print staire case for *
        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //Staire case for numers

        for(int i=1;i<=num;i++){
            //this variable must be inside first loop
            int x = 1;
            for(int j=1;j<=i;j++){
                //Remove space from the end of line, here we need to do it immeidetly after
                // it reaches to the end of line
                if(j == j+x-i){
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
