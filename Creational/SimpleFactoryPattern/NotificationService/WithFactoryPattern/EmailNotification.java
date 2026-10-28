package Creational.SimpleFactoryPattern.NotificationService.WithFactoryPattern;

class EmailNotification implements Notification {

    @Override 
    public void send() {
        System.out.println("Sending email notification.");
    }
}