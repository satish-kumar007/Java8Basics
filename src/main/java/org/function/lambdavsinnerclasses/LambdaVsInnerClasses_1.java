package org.function.lambdavsinnerclasses;
/*
Nameless inner classes are known as anonymous classes.
for example:
Runnable r = new Runnable(){
    public void run(){}
    };

We can easily replace this piece of code by lambda expression.
 */
public class LambdaVsInnerClasses_1 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++){
                    System.out.println("Child thread");
                }
            }
        };
        new Thread(r).start();

        //Replace this with lambda expression
        Runnable rr = () -> {
            for (int i=0;i<5;i++){
                System.out.println("Child thread using lambda expression");
            }
        };
        new Thread(rr).start();
    }
}
