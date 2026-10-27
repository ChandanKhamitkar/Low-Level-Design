package Creational.SimpleFactoryPattern.NotificationService.WithoutFactoryPattern;

// IMP: using interface & polymorphism doesn't automatically mean we're using a factory pattern
// Problem: service still creates concrete object itself. even after using (interface, polymorphism, and conditional logic)

// lets say further we add WhatsappNotification or 10 new notification types 
// -- then we keep again adding/making changes to this service file.

// currently this file doing 3 things
// 1. Conditional logic based on notification type
// 2. Creating object
// 3. Executing notification


class NotificationService {
    public void sendNotification(String type){
        if(type.equals("EMAIL")){
            Notification notification = new EmailNotification();
            notification.send();
        }
        else if(type.equals("SMS")){
            Notification notification = new SmsNotification();
            notification.send();
        }
        else if(type.equals("PUSH")){
            Notification notification = new PushNotification();
            notification.send();
        }
        else{
            System.out.println("Unsupported notification type!!");
        }
    }    
}
