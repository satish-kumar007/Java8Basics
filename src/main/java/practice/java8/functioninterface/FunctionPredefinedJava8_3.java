package practice.java8.functioninterface;

import java.util.ArrayList;
import java.util.function.Function;

/*
Code to get total salary of employees
 */
class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name='" + name + " : "+ "salary=" + salary;
    }
}
public class FunctionPredefinedJava8_3 {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Sunny",78900.00));
        employeeList.add(new Employee("Bunny",88900.00));
        employeeList.add(new Employee("Tunny",68900.00));
        employeeList.add(new Employee("Kunny",71900.00));
        employeeList.add(new Employee("Munny",70900.00));
        employeeList.add(new Employee("Lunny",25900.00));

        Function<ArrayList<Employee>, Double> employeeDoubleFunction = total -> {
            double sal = 0.0;
            for(Employee emp : employeeList){
                sal=sal+ emp.salary;
            }
            return sal;
        };
        System.out.println("Total Salary:: "+employeeDoubleFunction.apply(employeeList));
    }
}
