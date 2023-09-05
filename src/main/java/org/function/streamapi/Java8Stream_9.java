package org.function.streamapi;
//Get date and time using Java 8
public class Java8Stream_9 {
    public static void main(String[] args) {
        //Program to get date time using Java 8
        System.out.println("Date :: "+java.time.LocalDate.now());
        System.out.println("Time :: "+java.time.LocalTime.now());
        System.out.println("Date and Time :: "+java.time.LocalDateTime.now());
    }
}
