package Creational.SimpleFactoryPattern.NotificationService.WithoutFactoryPattern;

class PushNotification implements Notification  {
    @Override 
    public void send() {
        System.out.println("Sending push notification.");
    }
}
