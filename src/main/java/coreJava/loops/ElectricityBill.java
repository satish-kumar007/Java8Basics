package coreJava.loops;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double surCharge = 20.0/100.0;

        double billAmount = 0.0;
        if (units <= 50) {
            billAmount = (units * 0.50) ;
            billAmount = billAmount + (surCharge * billAmount);
            System.out.println((int)billAmount);
        }
        else if (units <= 150) {
            billAmount = ((50 * 0.50)
                    + (units - 50) * 0.75) ;
            billAmount = billAmount + (surCharge * billAmount);
            System.out.println((int)billAmount);
        }
        else if (units <= 250) {
            billAmount = ((50 * 0.50)
                    + (100 * 0.75)
                    + (units - 150)
                    * 1.20);
            billAmount = billAmount + (surCharge * billAmount);
            System.out.println((int)billAmount);
        }
        else if (units > 250) {
            billAmount = ((50 * 0.50)
                    + (100 * 0.75)
                    + (100 * 1.20)
                    + (units - 250)
                    * 1.50) ;
            billAmount = billAmount + (surCharge * billAmount);
            System.out.println((int)billAmount);
        }
        /*double billAmount = billAmount = 50 * 0.50F;

        if(units <= 50){
            System.out.println(billAmount);
        }else if(units > 50 && units <= 150) {
            units = units - 50;
            billAmount = (billAmount + (units * 0.75F)) + (surCharge * 100);
            System.out.println(billAmount);
        }else if(units > 150 && units <= 250) {
            units = units - 50;
            billAmount = (billAmount + (units * 0.75F));
            units = units - 100;
            billAmount = (billAmount + (units * 1.20F)) + (surCharge * 100);
            System.out.println(billAmount);
        }else{
            units = units-50;
            billAmount = (units * 0.50F);
            units = units - 100;
            billAmount = (billAmount + (units * 0.75F));
            units = units - 100;
            billAmount = (billAmount + (units * 1.20F));
            System.out.println(billAmount);

        }*/

    }
}
