package Creational.SimpleFactoryPattern.NotificationService.WithFactoryPattern;

class SmsNotification implements Notification  {
    @Override 
    public void send() {
        System.out.println("Sending SMS notification.");
    }
}
