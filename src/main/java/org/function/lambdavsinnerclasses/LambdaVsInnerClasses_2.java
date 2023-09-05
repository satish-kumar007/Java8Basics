package org.function.lambdavsinnerclasses;

public class LambdaVsInnerClasses_2 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i=0;i<5;i++){
                System.out.println("Child thread inside lambda");
            }
        });
        t.start();
    }
}