package practice.java8.lambdabasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
    public int empno;
    public String name;

    public Employee(int empno, String name) {
        this.empno = empno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                '}';
    }
}
public class CustomClassSortingJava8 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(200,"Luna"));
        emp.add(new Employee(600,"Dodo"));
        emp.add(new Employee(700,"Chunnu"));
        emp.add(new Employee(100,"Gogo"));
        emp.add(new Employee(300,"Sundi"));

        Collections.sort(emp, (e1,e2) -> (e1.empno < e2.empno)?-1:(e1.empno>e2.empno)?1:0);
        System.out.println(emp);
    }
}
