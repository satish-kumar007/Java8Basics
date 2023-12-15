package practice.java8.consumerinterface;

import java.util.function.Consumer;

/*
Consumer contains only 1 abstract method name accept() which will return nothing
void accept(T t)
 */
public class ConsumerExample_1 {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Satish");
        consumer.accept("Java");
    }
}
