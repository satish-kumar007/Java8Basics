package practice.java8.staticdefaultmethods;

interface I2{
    default void m1(){
        System.out.println("Default method");
    }
}
public class Java8DefaultAndStaticMethods_2 implements I2{
    @Override
    public void m1() {
        System.out.println("Overridden default method ");
    }

    public static void main(String[] args) {
        new Java8DefaultAndStaticMethods_2().m1();
    }
}
