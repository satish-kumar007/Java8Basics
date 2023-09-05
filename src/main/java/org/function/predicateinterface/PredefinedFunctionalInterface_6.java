package org.function.predicateinterface;
//Program for user authentication

import java.util.function.Predicate;

class User{
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
public class PredefinedFunctionalInterface_6 {
    public static void main(String[] args) {
        Predicate<User> userAuth = user -> user.username.equals("Satish") && user.password.equals("Java");
        boolean first_user = userAuth.test(new User("lovely","singh"));
        boolean second_user = userAuth.test(new User("Satish","Java"));
        System.out.println(first_user);
        System.out.println(second_user);
    }
}
