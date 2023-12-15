package DesignPattern.factory.example1;
/*
The factory design pattern is used in cases when there are multiple subclasses of a parent class or superclass.
Using the input provided and the factory design pattern, we can return one of the subclasses of the superclass.
The factory design pattern comes under the category of creational design pattern
First we define a factory method inside an interface.
The sub-class can now implement the defined factory method and decide which object to be created.
Using the factory design pattern, the subclasses can choose which type of objects to create.
Using the factory design pattern, we can hide or abstract object creation logic from the client.
The factory design pattern promotes loose-coupling i.e. eliminating the need to bind application-specific classes into the code.
Using the factory design pattern, we can create an abstract class or interface that can work with any classes.
 */
public abstract class Plan {
    protected double rate;
    public abstract void getRate();
    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
