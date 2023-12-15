package DesignPattern.prototype;

public class Bike extends Vehicle { // First child class

    public Bike() { // Default Constructor
    }
    public Bike(Bike b) { // Parameterized Constructor
        super(b); // Calling Parent class to initialize the object
    }
    @Override
    public Vehicle clone() {
        return new Bike(this); // Cloning current object with exact same functionality
    }
}