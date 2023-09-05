package org.function.consumerinterface;

import java.util.function.Consumer;

//Consumer chaining example
//c1.andThen(c2).andThen(c3).accept() means c1 apply first then c2 and then c3
class HollywoodMovie{
    String name;
    String rating;

    public HollywoodMovie(String name, String rating) {
        this.name = name;
        this.rating = rating;
    }
}
public class ConsumerExample_4 {
    public static void main(String[] args) {
        Consumer<HollywoodMovie> c1 = m1 -> System.out.println("Movie name:: "+m1.name);
        Consumer<HollywoodMovie> c2 = m2 -> System.out.println("Movie rating:: "+m2.rating);
        Consumer<HollywoodMovie> c3 = m1 -> System.out.println("Movie name:: "+m1.name+" store in DB");

        Consumer<HollywoodMovie> chainedConsumer = c1.andThen(c2).andThen(c3);
        HollywoodMovie movie1 = new HollywoodMovie("Terminator","Super Hit");
        chainedConsumer.accept(movie1);
    }
}
