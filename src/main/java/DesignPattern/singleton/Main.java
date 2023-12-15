package DesignPattern.singleton;

public class Main {
    public static void main(String[] args) {
        Employees emp = SingletonDesignPatternLazy.getEmployeeInstance();
        System.out.println(emp.hashCode());
        System.out.println(emp.hashCode());
    }
}
