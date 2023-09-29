package scaler.problems25092023;

import java.util.Scanner;

public class MakeItShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mangoes = sc.nextInt();
        int existingSlices = sc.nextInt();

        int totalSlices = (mangoes * 3) + existingSlices;
        int numOfShakeGlasses = totalSlices/2;
        System.out.println(numOfShakeGlasses);
    }
}
