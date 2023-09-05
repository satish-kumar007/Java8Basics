package org.function.functioninterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

//Write program to increment salary whose sal less than 100000 by 10%
public class FunctionPredefinedJava8_4 {
    public static void main(String[] args) {
        Predicate<Employee> employeePredicate = e -> e.salary<50000;
        Function<Employee, Employee> employeeFunction = e -> {
            e.salary = e.salary+(e.salary*10/100);
            return e;
        };
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Sunny",78900.00));
        employeeList.add(new Employee("Bunny",88900.00));
        employeeList.add(new Employee("Tunny",68900.00));
        employeeList.add(new Employee("Kunny",71900.00));
        employeeList.add(new Employee("Munny",70900.00));
        employeeList.add(new Employee("Lunny",25900.00));
        ArrayList<Employee> employeeList2 = new ArrayList<>();

        for(Employee emp : employeeList){
            if(employeePredicate.test(emp)){
                employeeList2.add(employeeFunction.apply(emp));
            }
        }
        System.out.println(employeeList2);
    }
}
