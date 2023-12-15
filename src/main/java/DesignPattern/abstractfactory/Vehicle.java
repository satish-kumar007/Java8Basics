package DesignPattern.abstractfactory;
/*
Abstract Factory Design Pattern, as the name suggests is an abstraction over Factory design pattern.
Abstract factory design pattern allows us to create a factory of factories, one level above the abstraction in the factory design pattern.
Consider a real-life analogy, just like a factory can create products or objects, similarly, an industry can create multiple factories. So industry can be understood as the abstract factory pattern, and a single factory can be understood as the factory pattern.
Abstract Factory Pattern is used by any client to create objects without any background knowledge of the structure, composition, and architecture of the system.

Note: Here, we are going to take an example of a Vehicle Booking System, in which we will be considering 3 types of Vehicles (Car, Auto, and Bike), unlike the structure shown above which has only 2 types of Vehicles (Car, and Bike). Also, the Car type Vehicles considered will be of 3 types (MicroCar, MiniCar, and MegaCar), unlike the above structure where only 2 types are given (MicroCar, and MegaCar). The 3 types of Vehicles will be Car, Auto, and Bike.
A Car in itself will be available in 3 types: Micro (Small Sized Car), Mini (Medium Sized Car), and Mega (Large Sized Car).
An Auto in itself will be available in 2 types: Personal (Available for full booking personally), and Shared (Available for just booking a single seat).
A Bike in itself will be available in 2 types: Sports (Expensive and Luxurius Class Bike), and Normal (Economy Class Bike).


 */
public interface Vehicle {
    void book(int distance);
    void setVehicleType();
    void setBaseCost();
    void setVehicleChargesPerUnitDistance();
    int calculateCostOfBooking(int distance);
}
