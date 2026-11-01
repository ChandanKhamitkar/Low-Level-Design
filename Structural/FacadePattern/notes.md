## Facade Pattern

Business scenario: Online Shopping Checkout

Imagine you're building an e-commerce application.

To place an order, the system needs to:

1. Validate the cart.
2. Process payment.
3. Update inventory.
4. Arrange shipping.
5. Send order confirmation.

Each operation belongs to a different service.

Without Facade, the client needs to interact with all these services individually.

Your task: Create a `CheckoutFacade` that provides one simple method:

```
checkout(order);
```

Internally, it should coordinate all five services.

Interview takeaway: Facade simplifies interaction with a complex subsystem by providing a unified interface. It reduces client-side complexity without replacing the underlying services.

The Facade's responsibility is to coordinate the workflow, not implement each service's business logic.