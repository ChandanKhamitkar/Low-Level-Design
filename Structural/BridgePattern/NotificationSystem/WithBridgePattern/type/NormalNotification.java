package Structural.BridgePattern.NotificationSystem.WithBridgePattern.type;

import Structural.BridgePattern.NotificationSystem.WithBridgePattern.sender.NotificationSender;

public class NormalNotification extends Notification {

    public NormalNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        sender.send(message);
    }
}
