package Creational.SimpleFactoryPattern.NotificationService.WithFactoryPattern;

class NotificationService {

    private final NotificationFactory factory;
    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    public void sendNotification(NotificationType notificationType){
        Notification notification = factory.createNotification(notificationType);
        notification.send();
    }    
}
