package org.function.staticdefaultmethods;
/*
Point 1: All the methods are abstract and all variables were public static final in JDK 7.
Point 2: Default method will declare with 'default' keyword.
Point 3: default method is by default available to implement for classes, nothing is forcing.
Point 4: If not want to use same, you can override and provide your functionality.
 */
interface I1{
    default void m1(){
        System.out.println("I am a default method");
    }
}
public class Java8DefaultAndStaticMethods_1 implements I1 {
    public static void main(String[] args) {
        new Java8DefaultAndStaticMethods_1().m1();

    }
}
