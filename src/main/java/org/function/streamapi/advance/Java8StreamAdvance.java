package org.function.streamapi.advance;

import java.util.*;
import java.util.stream.Collectors;

public class Java8StreamAdvance {
    static List<EmployeeObject> employeeObjectList = new ArrayList<EmployeeObject>();
    public static void main(String[] args) {
        employeeObjectList.add(new EmployeeObject(111, "Jeya", 30, "Female", "HR", 2011, 25000.0));
        employeeObjectList.add(new EmployeeObject(122, "Polish", 29, "Male", "Sales", 2015, 18500.0));
        employeeObjectList.add(new EmployeeObject(133, "Thomas", 26, "Male", "Administartion", 2012, 18700.0));
        employeeObjectList.add(new EmployeeObject(144, "Gowthami", 29, "Female", "Development", 2014, 33500.0));
        employeeObjectList.add(new EmployeeObject(155, "Nisha", 25, "Female", "HR", 2013, 22000.0));
        employeeObjectList.add(new EmployeeObject(166, "Issac", 40, "Male", "Maintenance", 2016, 12000.0));
        employeeObjectList.add(new EmployeeObject(177, "Sharmila", 30, "Female", "Finance", 2010, 29000.0));
        employeeObjectList.add(new EmployeeObject(188, "Linga", 33, "Male", "Development", 2015, 35000.0));
        employeeObjectList.add(new EmployeeObject(199, "John", 34, "Male", "Sales", 2016, 14500.0));
        employeeObjectList.add(new EmployeeObject(200, "Jeyam", 36, "Male", "Maintenance", 2015, 17000.0));
        employeeObjectList.add(new EmployeeObject(211, "kumar", 37, "Male", "Administartion", 2014, 18700.0));
        employeeObjectList.add(new EmployeeObject(222, "Joshi", 25, "Male", "Development", 2016, 29000.0));
        employeeObjectList.add(new EmployeeObject(233, "Reddy", 29, "Male", "Finance", 2013, 27000.0));
        employeeObjectList.add(new EmployeeObject(244, "Denwer", 28, "Male", "Sales", 2017, 18000.));
        employeeObjectList.add(new EmployeeObject(255, "Alia", 26, "Female", "Administartion", 2018, 13000.0));
        employeeObjectList.add(new EmployeeObject(266, "Sangavi", 36, "Female", "Development", 2015, 29000.0));
        employeeObjectList.add(new EmployeeObject(277, "Anuja", 32, "Female", "Development", 2012, 38000.0));

        //Get count of male and female employees
        Map<String, Long> countEmp = employeeObjectList.stream().collect(Collectors.groupingBy(EmployeeObject::getEmp_gender, Collectors.counting()));
        System.out.println(countEmp);

        //Show distinct department in the list
        employeeObjectList.stream().map(EmployeeObject::getEmp_dep).distinct().forEach(System.out::println);

        //Get average age of men and women
        Map<String, Double> avgAge = employeeObjectList.stream().collect(Collectors.groupingBy(EmployeeObject::getEmp_gender,Collectors.averagingInt(EmployeeObject::getEmp_age)));
        System.out.println(avgAge);

        //Find the highest paid employee
        Optional<EmployeeObject> highestSal = employeeObjectList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(EmployeeObject::getEmp_salary)));
        System.out.println(highestSal.get().emp_name);

        System.out.println("===============================================================================");
        //list Employee joined after 2014
        List<EmployeeObject> employee = employeeObjectList.stream().filter(emp -> emp.year_of_joining >= 2014).collect(Collectors.toList());
        for (EmployeeObject obj : employee){
            System.out.println(obj.emp_name);
        }
    }
}
