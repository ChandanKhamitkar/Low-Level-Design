package Creational.SimpleFactoryPattern.NotificationService.WithFactoryPattern;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        NotificationService service = new NotificationService(factory);

        service.sendNotification("EMAIL");
        service.sendNotification("SMS");
        service.sendNotification("PUSH");
        service.sendNotification("WHATSAPP");
    }
}
