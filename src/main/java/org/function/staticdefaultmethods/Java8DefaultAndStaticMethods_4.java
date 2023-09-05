package org.function.staticdefaultmethods;
/*
static method inside interface
What is the need?
Point 1: interface static method by default not available for implementation class.
Point 2: Can be called only with Interface name.
Point 3: It is providing utility to the interface.
Point 4: Overriding concepts failed here as static method not available for implementation class.
Point 5: We can run interface directly by using main method as it is static method.
 */
interface I3{
    static void m1(){
        System.out.println("static method");
    }
}
public class Java8DefaultAndStaticMethods_4 implements I3{
    public static void main(String[] args) {
        I3.m1();
        //new Java8DefaultAndStaticMethods_4().m1()//error
    }
}
