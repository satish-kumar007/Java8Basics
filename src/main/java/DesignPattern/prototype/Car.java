package DesignPattern.prototype;

public class Car extends Vehicle { // Second child class

    public Car() {  //Default Constructor
    }
    public Car(Car c) { // Parameterized Constructor
        super(c); // Calling Parent class to initialize the object
    }
    @Override
    public Vehicle clone() {
        return new Car(this); // Cloning current object with exact same functionality
    }
}