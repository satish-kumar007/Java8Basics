package practice.java8.consumerinterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//Example to show the grade of students
class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class ConsumerExample_3 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sunny", 90));
        studentList.add(new Student("Chinny", 50));
        studentList.add(new Student("Bunny", 60));
        studentList.add(new Student("Tunny", 70));
        studentList.add(new Student("Aunny", 80));
        studentList.add(new Student("Lunny", 30));
        studentList.add(new Student("Gunny", 87));

        Predicate<Student> p = m -> m.marks>60;
        Function<Student, String> stndFunction = st -> {
            int marks = st.marks;
            if (marks >= 80) {
                return "A";
            } else if (marks >= 60) {
                return "B";
            } else if (marks >= 50) {
                return "C";
            } else if (marks > 40) {
                return "D";
            } else {
                return "E";
            }
        };
        Consumer<Student> c = con -> {
            System.out.println(con.marks);
            System.out.println(con.name);
            System.out.println(stndFunction.apply(con));
            System.out.println();
        };

        for(Student st : studentList){
            if(p.test(st)){
                c.accept(st);
            }

        }
    }
}
