package scaler.problems25092023;

import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        double meter = height * 0.01;

        double bmi = weight/(Math.pow(meter,2.0));
        double roundedBmi = Math.round(bmi*10)/10d;
        if(roundedBmi < 18.5){
            System.out.println("Underweight");
            System.out.println(roundedBmi);
        }else if(roundedBmi > 18.5 && roundedBmi <= 24.9){
            System.out.println("Normal");
            System.out.println(roundedBmi);
        }else if(roundedBmi > 24.9 && roundedBmi <= 29.9){
            System.out.println("Overweight");
            System.out.println(roundedBmi);
        }else if(roundedBmi > 29.9 ){
            System.out.println("Obese");
            System.out.println(roundedBmi);
        }else{
            System.out.println("");
        }

    }
}
