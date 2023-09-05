package org.function.lambdabasic;
public class ThreadUsingJava8 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i=0;i<5;i++){
                System.out.println("I am a child thread");
            }
        };
        new Thread(runnable).start();
    }
}
