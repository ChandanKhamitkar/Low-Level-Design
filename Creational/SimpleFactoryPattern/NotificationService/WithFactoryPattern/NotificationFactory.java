package Creational.SimpleFactoryPattern.NotificationService.WithFactoryPattern;

// Only responsible for creating object not executing them
// Why "EMAIL".equals(notificationType), why not notificationType.equals("EMAIL")
// notificationType.equals("EMAIL") gives NullPointerException when null as input is passed

// LIMITATIONS:
// Adding a new notification type still requires updating the factory.
// The factory still needs a selection mechanism, such as switch or a registry.
// Simple Factory doesn't inherently guarantee compliance with the Open-Closed Principle.


class NotificationFactory {

    public Notification createNotification(NotificationType type) {

        switch (type) {
            case EMAIL:
                return new EmailNotification();

            case SMS:
                return new SmsNotification();

            case PUSH:
                return new PushNotification();

            default:
                throw new IllegalArgumentException(
                    "Unsupported notification type: " + type
                );
        }
    }
}