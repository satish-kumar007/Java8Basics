package DesignPattern.factory.example2;

public class SMSNotification implements Notification{
    @Override
    public void userNotification() {
        System.out.println("This is SMS Notification");
    }
}
