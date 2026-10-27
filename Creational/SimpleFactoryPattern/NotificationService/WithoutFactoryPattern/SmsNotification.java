package Creational.SimpleFactoryPattern.NotificationService.WithoutFactoryPattern;

class SmsNotification implements Notification  {
    @Override 
    public void send() {
        System.out.println("Sending SMS notification.");
    }
}
