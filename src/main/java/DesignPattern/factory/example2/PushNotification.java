package DesignPattern.factory.example2;

public class PushNotification implements Notification{
    @Override
    public void userNotification() {
        System.out.println("This is Push Notification");
    }
}
