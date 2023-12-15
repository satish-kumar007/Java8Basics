package practice.java8.staticdefaultmethods;
/*
default method in case of multiple inheritance can result ambiguity problem.
Below is the solution for this problem.

 */
interface Left{
    default void m1(){
        System.out.println("default left");
    }
}
interface Right{
    default void m1(){
        System.out.println("default right");
    }
}
public class Java8DefaultAndStaticMethods_3 implements Left,Right {
    @Override
    public void m1() {
        System.out.println("My own implementation");;
        Left.super.m1();
        Right.super.m1();
    }

    public static void main(String[] args) {
        new Java8DefaultAndStaticMethods_3().m1();
    }
}
