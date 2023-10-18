package scaler.problems16102023;

import java.util.Scanner;

public class PrintAllCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        for(int i=0;i<n;i++){
            System.out.println(str.charAt(i));
        }
        //get symbols
        for(int i=0;i<n;i++){
            int ch = str.charAt(i);
            System.out.println(ch);
        }
        //count uppercase and lowercase
        int upperCounter = 0;
        int lowerCOunter = 0;
        for(int i=0;i<n;i++){
            int ch = str.charAt(i);
            if(ch >=65 && ch<=90){
                upperCounter++;
            }else if(ch >=97 && ch<=122){
                lowerCOunter++;
            }
        }
        System.out.println(upperCounter);
        System.out.println(lowerCOunter);
    }
}
