package DesignPattern.factory.example2;

public class GetNotification {

    public Notification getNotification(String notification){
        if(notification.equalsIgnoreCase("sms")){
            return new SMSNotification();
        }else if(notification.equalsIgnoreCase("email")){
            return new EmailNotification();
        }else if(notification.equalsIgnoreCase("push")){
            return new PushNotification();
        }else{
            return null;
        }
    }
}
