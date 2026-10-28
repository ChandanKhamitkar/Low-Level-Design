package Creational.SimpleFactoryPattern.NotificationService.WithFactoryPattern;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        NotificationService service = new NotificationService(factory);

        service.sendNotification(NotificationType.EMAIL);
        service.sendNotification(NotificationType.PUSH);
        service.sendNotification(NotificationType.SMS);
        service.sendNotification(NotificationType.WHATSAPP);
    }
}
