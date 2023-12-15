package practice.java8.predicateinterface;

import java.util.function.Predicate;

/*
Predicate Joining:
Point 1: negate() is a default method in predicate to return the logical negation of this predicate.
Point 2: and() Returns a composed predicate that represents a short-circuiting logical AND of this predicate and another.

 */
public class PredefinedFunctionalInterface_3 {
    public static void main(String[] args) {
        int[] x = {6,4,3,8,20,34,35,12,56,6,90};
        Predicate<Integer> predicate1 = num -> num>10;
        Predicate<Integer> predicate2 = num -> num%2==0;
        m1(predicate1, x);
        System.out.println();
        m1(predicate1.negate(),x);
        System.out.println();
        m1(predicate1.and(predicate2), x);
        System.out.println();
        m1(predicate1.or(predicate2), x);
    }
    public static void m1(Predicate<Integer> predicate, int[] arr){
        for(int x : arr){
            if(predicate.test(x)){
                System.out.print(x+",");
            }
        }
    }
}
