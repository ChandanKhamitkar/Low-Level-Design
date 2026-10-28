package Creational.SimpleFactoryPattern.NotificationService.WithFactoryPattern;

// Only responsible for creating object not executing them
// Why "EMAIL".equals(notificationType), why not notificationType.equals("EMAIL")
// notificationType.equals("EMAIL") gives NullPointerException when null as input is passed


class NotificationFactory {

    public Notification createNotification(String notificationType) {

        if ("EMAIL".equals(notificationType)) {
            return new EmailNotification();
        }

        if ("SMS".equals(notificationType)) {
            return new SmsNotification();
        }

        if ("PUSH".equals(notificationType)) {
            return new PushNotification();
        }

        throw new IllegalArgumentException(
                "Unknown Notification Type: " + notificationType);
    }
}