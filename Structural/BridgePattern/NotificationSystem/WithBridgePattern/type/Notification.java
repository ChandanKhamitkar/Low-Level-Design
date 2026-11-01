package Structural.BridgePattern.NotificationSystem.WithBridgePattern.type;

import Structural.BridgePattern.NotificationSystem.WithBridgePattern.sender.NotificationSender;

/*
- Notification doesn't know whether the message is sent through Email, SMS or Push.
- It acts as a base class, the sub-classes extending this are the classess we will be using.
*/

public abstract class Notification {
    
    protected final NotificationSender sender;

    public Notification(NotificationSender sender){
        this.sender = sender;
    }

    public abstract void notifyUser(String message);
}
