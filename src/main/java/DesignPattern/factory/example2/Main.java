package DesignPattern.factory.example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GetNotification getNotification = new GetNotification();
        Scanner sc = new Scanner(System.in);
        String type = sc.next();

        Notification notification = getNotification.getNotification(type);
        notification.userNotification();
    }
}
