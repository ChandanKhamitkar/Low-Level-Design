Here's how inheritance creates class explosion in our Notification System without Bridge Pattern.

### 1. Separate classes for every combination

```
class NormalEmailNotification {
    void send(String msg) { /* Email logic */ }
}

class UrgentEmailNotification {
    void send(String msg) { /* Email logic + Urgent */ }
}

class NormalSMSNotification {
    void send(String msg) { /* SMS logic */ }
}

class UrgentSMSNotification {
    void send(String msg) { /* SMS logic + Urgent */ }
}

class NormalPushNotification {
    void send(String msg) { /* Push logic */ }
}

class UrgentPushNotification {
    void send(String msg) { /* Push logic + Urgent */ }
}
```

### 2. What happens as requirements grow?

Suppose we have:

- 3 notification types: Normal, Urgent, Critical.
- 4 delivery mechanisms: Email, SMS, Push, WhatsApp.

Class combinations

# 12 classes

3 notification types × 4 delivery mechanisms

|          | Email | SMS | Push | WhatsApp |
| -------- | ----- | --- | ---- | -------- |
| Normal   | ✓     | ✓   | ✓    | ✓        |
| Urgent   | ✓     | ✓   | ✓    | ✓        |
| Critical | ✓     | ✓   | ✓    | ✓        |

Now imagine adding 5 more notification types and 6 more delivery mechanisms. You'll need 8 × 10 = 80 combination classes.

Every new combination means more classes to implement, test and maintain.

That's exactly the problem Bridge solves by separating these two dimensions.