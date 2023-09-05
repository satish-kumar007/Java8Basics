package org.function.functioninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/*
Program to find the grade of students
80>=Distinction
>=60 B
>=50 - C

 */
class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class FunctionPredefinedJava8_2 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sunny",90));
        studentList.add(new Student("Chinny",50));
        studentList.add(new Student("Bunny",60));
        studentList.add(new Student("Tunny",70));
        studentList.add(new Student("Aunny",80));
        studentList.add(new Student("Lunny",30));
        studentList.add(new Student("Gunny",87));

        Function<Student,String> stndFunction = st -> {
            int marks = st.marks;
            if(marks>=80){
               return "A";
            } else if (marks>=60) {
                return "B";
            }else if (marks>=50){
                return "C";
            } else if (marks>40) {
                return "D";
            }else {
                return "E";
            }
        };
        Predicate<Student> p = s -> s.marks >= 60;
        for(Student ss : studentList){

            if(p.test(ss)){
                System.out.println(ss.name+"  "+ss.marks+"  "+stndFunction.apply(ss));
                System.out.println();
            }
        }

    }

}
