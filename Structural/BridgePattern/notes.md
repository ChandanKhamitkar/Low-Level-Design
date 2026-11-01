## Bridge Pattern

Problem: When a system has two or more independent dimensions that can vary, using inheritance creates too many classes for every possible combination.

Example: A notification system has:

- Types: Normal, Urgent, Critical.
- Delivery mechanisms: Email, SMS, Push, WhatsApp.

Without Bridge, we'd need separate classes for combinations like `UrgentEmail`, `NormalSMS`, `CriticalPush`, etc.

Solution: Bridge separates these independent dimensions into two hierarchies and connects them using composition.

Why use it?

- Avoids class explosion.
- Both dimensions can evolve independently.
- New notification types don't require changes to delivery mechanisms.
- New delivery mechanisms don't require changes to notification types.

Real-world use cases:

- UI: Shapes × Rendering engines.
- Payments: Payment types × Payment gateways.
- Notifications: Notification types × Delivery channels.
- Remote controls × Electronic devices.

Interview takeaway: Use Bridge when you have multiple independent dimensions of variation that should evolve independently.

---

Remember this distinction:
- Strategy: Swap an algorithm or behavior.
- Bridge: Separate two independent dimensions of a design, each with its own hierarchy.