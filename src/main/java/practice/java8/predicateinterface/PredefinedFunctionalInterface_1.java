package practice.java8.predicateinterface;

import java.util.function.Predicate;

/*
Following are the pre-defined functional interfaces:
Predicate
Function
Consumer
Supplier
Point 1: All the pre-defined functional interfaces belongs to java.util.function package.
Point 2: In general predicate means perform some operation based on conditions and return boolean.
Point 3: e.g. number greater than or not, employee available check etc.
Point 4: In Predicate there is one abstract method name test(T t) which return boolean.
interface Predicate{ boolean test(T t);}
 */
public class PredefinedFunctionalInterface_1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = num -> num > 10;
        boolean check = predicate.test(4);
        System.out.println(check);

        Predicate<String> predicate1 = str -> str.length() > 10;
        boolean lengthCheck = predicate1.test("my name is Satish");
        System.out.println(lengthCheck);

        Predicate<String> predicate2 = str -> str.isEmpty();
        boolean nullCheck = predicate2.test("");
        System.out.println(nullCheck);

        String s = "";
        System.out.println(s.isEmpty());
    }
}
