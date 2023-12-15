package practice.java8.predicateinterface;
//Design an application for Employee Management System.

import java.util.ArrayList;
import java.util.function.Predicate;

class Employees{
    String name;
    String designation;
    String city;
    double salary;

    public Employees(String name, String designation, String city, double salary) {
        this.name = name;
        this.designation = designation;
        this.city = city;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees[" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                ']';
    }
}
public class PredicateFunctionalInterface_7 {
    public static void main(String[] args) {
        ArrayList<Employees> employeesList = new ArrayList<>();
        employeesList.add(new Employees("Satish","Lead","Pune",150000.00));
        employeesList.add(new Employees("Priya","Manager","Delhi",250000.00));
        employeesList.add(new Employees("Shaanu","Engineer","Delhi",50000.00));
        employeesList.add(new Employees("Neymar","CEO","Paris",550000.00));
        employeesList.add(new Employees("Ronaldo","Sr. Engineer","London",120000.00));
        employeesList.add(new Employees("Suzi","Manager","London",100000.00));
        employeesList.add(new Employees("Vishu","Engineer","Pune",70000.00));
        employeesList.add(new Employees("Tammu","Engineer","Pune",70000.00));

        //check All Employees list who are manager and then print
        Predicate<Employees> employeesPredicate = ep -> ep.designation.equals("Manager");
        display(employeesPredicate,employeesList);
        System.out.println("*******************************************************************");
        //Get employees list belongs to Pune
        Predicate<Employees> puneEmployee = pemp -> pemp.city.equals("Delhi");
        for(Employees puneEmp : employeesList){
            if(puneEmployee.test(puneEmp)){
                System.out.println(puneEmp);
            }
        }
        //Get employees list salary < 100000
        System.out.println("*******************************************************************");
        Predicate<Employees> employeesLessSalPredicate = ep -> ep.salary < 100000;
        display(employeesLessSalPredicate,employeesList);

        //Give pink slip to employee who is manager and from Delhi
        System.out.println("*******************************************************************");
        display(employeesPredicate.and(puneEmployee),employeesList);

        //get All employee list who are manager and salary less than 2550000
        System.out.println("*******************************************************************");
        display(employeesPredicate.or(employeesLessSalPredicate), employeesList);


        //get All employee who are not manager
        System.out.println("*******************************************************************");
        display(employeesPredicate.negate(), employeesList);

        //Check employee is CEO or not
        System.out.println("*******************************************************************");
        Predicate<Employees> ceoPredicate = Predicate.isEqual(new Employees("Neymar","CEO","Paris",550000.00));

    }
    //check All Employees list who are manager and then print
    public static void display(Predicate<Employees> employeesPredicate, ArrayList<Employees> employees){
        for(Employees eps : employees){
            if(employeesPredicate.test(eps)){
                System.out.println(eps);
            }
        }
    }
}
