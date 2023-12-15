package DesignPattern.prototype;

import java.util.*;

public class Showroom {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>(); // List for Original objects
        List<Vehicle> vehiclesCopy = new ArrayList<>(); // List for Cloned objects

        Bike b1 = new Bike(); // Demo Bike object
        b1.seats = 1;
        b1.tyres = 2;
        b1.color = "Black";
        b1.fuel = "Petrol";
        vehicles.add(b1);

        Car c1 = new Car(); // Demo Car object
        c1.seats = 5;
        c1.tyres = 4;
        c1.color = "White";
        c1.fuel = "Electric";
        vehicles.add(c1);

        for (Vehicle vehicle : vehicles) { // cloning each object of 'vehiles' list
            vehiclesCopy.add(vehicle.clone());
        }
        System.out.print("Original Objects:-\n");
        for (Vehicle vehicle : vehicles) { // Printing Original objects
            System.out.println(vehicle.toString());
            System.out.println("---------------------------------------------------------");
        }
        System.out.print("\n\n\nPrototyped Objects:-\n");
        for (Vehicle vehicle : vehiclesCopy) { // Printing cloned objects
            System.out.println(vehicle.toString());
            System.out.println("---------------------------------------------------------");
        }
    }
}
