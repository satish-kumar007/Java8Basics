package org.function.consumerinterface;
//Program to display movie information using consumer

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie{
    String name;
    String hero;
    String actress;

    public Movie(String name, String hero, String actress) {
        this.name = name;
        this.hero = hero;
        this.actress = actress;
    }
}
public class ConsumerExample_2 {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Terminator","Arnold","Jen"));
        movies.add(new Movie("Terminator-1","Arnold","Jen"));
        movies.add(new Movie("Terminator-2","Arnold","Jen"));
        movies.add(new Movie("Titanic","Leonardo","Kate"));
        movies.add(new Movie("RRR","Ram Chran","Aliya"));
        movies.add(new Movie("Bahubali","Prabhas","Anushka"));
        movies.add(new Movie("Avtar","Jack","Kaya"));

        Consumer<Movie> c = m -> {
            System.out.println(m.name);
            System.out.println(m.actress);
            System.out.println(m.hero);
            System.out.println();
        } ;
        for(Movie m : movies){
            c.accept(m);
        }
    }
}
