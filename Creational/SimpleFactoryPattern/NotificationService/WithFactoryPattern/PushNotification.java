package Creational.SimpleFactoryPattern.NotificationService.WithFactoryPattern;

class PushNotification implements Notification  {
    @Override 
    public void send() {
        System.out.println("Sending push notification.");
    }
}
