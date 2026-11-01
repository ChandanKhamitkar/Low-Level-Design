## When and why do we use Decorator Pattern?

We use Decorator when a business wants to add optional features or responsibilities to an existing object dynamically, without modifying its original class.

Let's understand why the other approaches become problematic.

### 1. Without Decorator — Inheritance explosion

Imagine a coffee business.

Initially:

- Basic Coffee
- Milk Coffee
- Sugar Coffee
- Milk + Sugar Coffee
- Milk + Sugar + Cream Coffee

You might create separate classes for every combination.

With 5 optional toppings, there can be up to \\(2^5 = 32\\) combinations.

With 10 toppings, that's 1,024 combinations!

Problem: Too many classes, duplicated logic, difficult maintenance.

### 2. Why not use Simple Factory?

You could create a `CoffeeFactory` that accepts toppings and constructs the appropriate coffee.

But:

- Factory needs to know all possible combinations.
- Every new topping potentially requires factory modifications.
- Combination logic keeps growing.
- You still need a way to represent the combinations.

Factory solves object creation; Decorator solves dynamically adding responsibilities.

### 3. Why not use Builder?

Builder is useful when an object has many optional configuration parameters.

But Decorator is different:

- Builder configures an object during construction.
- Decorator wraps an existing object and adds behavior.

For example, adding milk to an already-created coffee is a natural fit for Decorator.

### 4. Real-world applications

| Business/domain    | Decorator use case                              |
| ------------------ | ----------------------------------------------- |
| Payment processing | Add logging, transaction metrics, retries       |
| File handling      | Add compression, encryption, buffering          |
| HTTP clients       | Add authentication, caching, logging            |
| E-commerce         | Add gift wrapping, insurance, premium packaging |
| Notifications      | Add encryption, tracking, formatting            |

### 5. Actual codebase modification scenario

Imagine an HTTP client:

Initially, it simply sends requests.

Later, the business asks for:

- Request logging.
- Authentication headers.
- Response caching.
- Retry mechanism.

Without Decorator, you might keep modifying the original HTTP client or create subclasses for combinations of these features.

With Decorator, each feature can independently wrap the HTTP client.

This makes features composable and easier to maintain.

### Interview takeaway

Use Decorator when:

- You need optional, combinable features.
- You want to extend behavior without modifying the original class.
- Inheritance would create too many subclasses.
- Features should be added or removed dynamically.

Avoid Decorator when:

- The object has very few stable variations.
- A simple configuration or constructor is sufficient.
- Excessive wrapping makes debugging and tracing behavior difficult.

One important distinction to remember:

- Adapter: Makes incompatible interfaces work together.
- Proxy: Controls access to an object.
- Decorator: Adds responsibilities to an object.