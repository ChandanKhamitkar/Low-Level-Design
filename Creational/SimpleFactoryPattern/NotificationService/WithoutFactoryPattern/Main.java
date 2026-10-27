package Creational.SimpleFactoryPattern.NotificationService.WithoutFactoryPattern;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.sendNotification("EMAIL");
        service.sendNotification("SMS");
        service.sendNotification("PUSH");
        service.sendNotification("WHATSAPP");
    }
}
