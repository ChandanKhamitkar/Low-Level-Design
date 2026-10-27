package Creational.SimpleFactoryPattern.NotificationService.WithoutFactoryPattern;

class EmailNotification implements Notification {

    @Override 
    public void send() {
        System.out.println("Sending email notification.");
    }
}