package DesignPattern.factory.example1;

import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        GetPlan plan = new GetPlan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter plan:  ");
        String pln = sc.next();
        System.out.println("Enter Units:  ");
        int units = sc.nextInt();

        Plan p = plan.getPlan(pln);
        System.out.println("Bill amount for plan :: "+pln+" and units : "+units+" is :: ");
        p.getRate();
        p.calculateBill(units);
    }
}
