package practice.java8.lambdavsinnerclasses;

/*
Point 1: We can declare instance variable inside anonymous class.
Point 2: If we use 'this' keyword inside anonymous class it always refers to the inner variables.
Point 3: It is not possible to declare instance variable inside anonymous inner class.
Point 4: Inside lambda 'this' keyword always refers outer class instance variables.
 */
interface Interef{
    public void m1();
}
public class LambdaVsInnerClasses_4 {
    int x =90;
    public static void main(String[] args) {

        Interef interef = new Interef() {
            int x=91;//instance variable
            @Override
            public void m1() {
                System.out.println(this.x);
                System.out.println(x);
            }
        };
        interef.m1();
        new LambdaVsInnerClasses_4().m2();

    }
    public void m2(){

        //Using lambda expression
        Interef inter1 = () -> {
            int x=30;
            System.out.println("lambda: this.x :: "+this.x);
            System.out.println("Lambda x :: "+x);
        };
        inter1.m1();
    }
}
