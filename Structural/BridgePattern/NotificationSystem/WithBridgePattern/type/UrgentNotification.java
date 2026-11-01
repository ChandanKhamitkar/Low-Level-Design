package Structural.BridgePattern.NotificationSystem.WithBridgePattern.type;

import Structural.BridgePattern.NotificationSystem.WithBridgePattern.sender.NotificationSender;

public class UrgentNotification extends Notification {

    public UrgentNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        sender.send("[URGENT] " + message);
    }
}
