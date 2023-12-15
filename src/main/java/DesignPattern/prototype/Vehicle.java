package DesignPattern.prototype;
/*
Prototype Design Pattern

Prototype design pattern is one of the creational design patterns.
It allows us to specify objects which are prototypes of original objects. In other words, it allows us to copy existing objects instead of making new instances.
Prototype Design Pattern is mainly used when creating new objects from scratch is expensive.
Real World Example
Assume that we are having one program for Inserting data into a database from one specific source.

Now, we have received one new requirement before inserting data into the database, we need to perform some type of data preprocessing and data modifications. As we are already having a program for inserting data, we can use this object and do some changes to it so that it can modify/pre-process the data and then insert it into the database.

To perform this, we will clone the existing object into the new object and make necessary changes to this new object.

For Prototype Design Pattern, it is mandatory to have a copy feature in existing objects. If we want to create prototypes of our object, we need to implement/define a clone() method for that object/class. Although, it depends on our design and requirement whether to use a shallow or deep copy of the existing objects.

Shallow Copy - In shallow copy, we only clone the parent object and not its containing objects.

In shallow copy, we copy references of the Original object, and hence if we make any changes in one of the objects, those changes get reflected in other objects as well.
Deep Copy - In a deep copy, we clone the parent object as well as its containing objects.

In a deep copy, we copy the original object with its values so after copying, both the objects are independent of each other, and hence, if we make any changes in one object, that change does not get reflected in the other object.

List of other examples
Mobile Phone making company releasing different mobiles for various segments. Now, each mobile will have some basic common functionality with some extent of variations. Here, the company will use one of its phone software and clone it according to other phones.

Prototype Design Pattern Implementation Steps
Either we can create an abstract class or interface having an abstract clone() method or we can simply add the method in all existing class hierarchies, if available.
Our prototype or abstract class will have a constructor which will accept an object of this class as an argument. This constructor will copy all the instances from the passed object to the new one. In the case of changing of subclasses, it must call the parent constructor to let the cloning of private fields from the superclass.
The clone() method which we define in our subclasses will usually return a new object with the prototypical version of the constructor. Here, each class will explicitly override the cloning method otherwise, it will return an object of a parent class.
If we use some specific type of prototype often, then it would be a great idea to store them by creating a centralized prototype registry.
 */
public abstract class Vehicle { // Abstract class having declartion of Clone() method
    // Class Variables
    protected int seats;
    protected int tyres;
    protected String color;
    protected String fuel;

    public Vehicle() { // Default Constructor
    }
    public Vehicle(Vehicle v) { // Parameterized Constructor
        if (v!= null){ // Checking passed object is null or not
            // Copying values from original object into the prototyped object
            this.seats = v.seats;
            this.tyres = v.tyres;
            this.color = v.color;
            this.fuel = v.fuel;
        }
    }
    public abstract Vehicle clone(); // Abstract Clone() method - Child classes implement this method
    @Override
    public String toString() { // Overriding toString() method so that we can get desired print format
        return "Seats: " + this.seats + "\nTyres: " + this.tyres + "\nColor: " + this.color + "\nFuel: " + this.fuel + "\n";
    }
}