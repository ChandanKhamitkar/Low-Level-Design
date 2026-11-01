## Flyweight 
is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

- This constant data of an object is usually called the intrinsic state. 
- It lives within the object; other objects can only read it, not change it. 
- The rest of the object’s state, often altered “from the outside” by other objects, is called the extrinsic state.

-  As you’ve probably guessed by now, an object that only stores the intrinsic state is called a flyweight.

### Flyweight and immutability
Since the same flyweight object can be used in different contexts, you have to make sure that its state can’t be modified. A flyweight should initialize its state just once, via constructor parameters. It shouldn’t expose any setters or public fields to other objects.

## Flyweight Pattern

Problem: Creating thousands of similar objects wastes memory when many objects share the same data.

Solution: Share common data (Intrinsic State) across multiple objects instead of storing duplicate copies.

Key concepts:

- Intrinsic State: Shared data (e.g., tree name, color, texture).
- Extrinsic State: Unique data (e.g., tree position X, Y).
- Flyweight Factory: Maintains and reuses shared objects, typically using a Map.
- Flyweight objects should be immutable to ensure safe sharing.

Why use it?

- Reduces memory consumption.
- Avoids duplicate object creation.
- Improves memory efficiency when handling large numbers of similar objects.

Real-world use cases:

- Games: Trees, bullets, particles.
- Text editors: Shared character/font formatting data.
- Browser: Reusable styles and metadata.
- Maps: Repeated icons and visual assets.

Interview takeaway: Use Flyweight when a large number of objects share common state, and separating shared from unique state can significantly reduce memory usage.