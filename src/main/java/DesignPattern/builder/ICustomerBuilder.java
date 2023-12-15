package DesignPattern.builder;
/*
Builder design pattern is a creational design pattern that allows us to construct an object step-by-step.

Imagine that we want to build software that accepts customers' details and stores them in a database.
Customers are shown a form that accepts the below mandatory and optional fields.

Mandatory Fields - First Name, Last Name, Primary Email, and Primary Mobile Number
Optional Fields - Middle Name, Secondary Email, and Secondary Mobile Number
Ideally, we create a Customer class with the mandatory and optional attributes listed above.
The builder design pattern lets us create an object step by step without passing all the values to the constructor.
Builder design pattern eliminates the telescopic constructor problem where we create several overloaded constructors with fewer arguments.
In Java, the builder design pattern is used in the StringBuilder class. StringBuilder contains the append() method to construct string step-by-step, and finally, we call the toString() method to get the constructed string object.

StringBuilder builder = new StringBuilder();

String message = builder
    .append("Thank You")
    .append("\n")
    .append("Come Back")
    .toString();
 */
public interface ICustomerBuilder {
    ICustomerBuilder firstName(String firstName);
    ICustomerBuilder lastName(String lastName);
    ICustomerBuilder middleName(String middleName);
    ICustomerBuilder primaryEmail(String primaryEmail);
    ICustomerBuilder secondaryEmail(String secondaryEmail);
    ICustomerBuilder primaryMobileNumber(String primaryMobileNumber);
    ICustomerBuilder secondaryMobileNumber(String secondaryMobileNumber);
}
