package Structural.BridgePattern.NotificationSystem.WithBridgePattern.sender;

public class PushSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}