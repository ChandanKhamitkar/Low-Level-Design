package Structural.BridgePattern.NotificationSystem.WithBridgePattern;

import Structural.BridgePattern.NotificationSystem.WithBridgePattern.sender.EmailSender;
import Structural.BridgePattern.NotificationSystem.WithBridgePattern.sender.PushSender;
import Structural.BridgePattern.NotificationSystem.WithBridgePattern.sender.SMSSender;
import Structural.BridgePattern.NotificationSystem.WithBridgePattern.type.NormalNotification;
import Structural.BridgePattern.NotificationSystem.WithBridgePattern.type.Notification;
import Structural.BridgePattern.NotificationSystem.WithBridgePattern.type.UrgentNotification;

public class Main {
    public static void main(String[] args) {

        Notification normalEmail = new NormalNotification(new EmailSender());

        Notification urgentSMS = new UrgentNotification(new SMSSender());

        Notification urgentPush = new UrgentNotification(new PushSender());

        normalEmail.notifyUser("Welcome!");
        urgentSMS.notifyUser("Payment failed");
        urgentPush.notifyUser(("Security alert!"));
    }
}
