package DesignPattern.factory.example2;

public class EmailNotification implements Notification{
    @Override
    public void userNotification() {
        System.out.println("This is Email Notification");
    }
}
