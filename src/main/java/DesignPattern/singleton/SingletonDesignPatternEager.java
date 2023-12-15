package DesignPattern.singleton;
/*
Here, singleton means, create only a single object across the JVM.
There are 2 approaches by which we can create singleton object.
The first way to create is using Eager initialization - It means, create object first and then supply it when called by the client.
The second way is to create using Lazy initialization - It means, create the object when needed by client.
The singleton object should be able to work in a multithreaded environment.
The above approaches was failing at some extent while working with multithreaded environment.
Due to that Bill Pugh came with a solution using an inner static helper class.
We can use Refection to delete all previous singleton objects creation approaches.
Open Topics:
Singleton with Enum -- to do
Singleton with Serialization -- to do
Singleton -- to do
 */
public class SingletonDesignPatternEager {
//Eager initialization example
    private static final Employees emp = new Employees();
    private SingletonDesignPatternEager(){
    }

    public static synchronized Employees getEmployeesObject(){
        return emp;
    }
}
