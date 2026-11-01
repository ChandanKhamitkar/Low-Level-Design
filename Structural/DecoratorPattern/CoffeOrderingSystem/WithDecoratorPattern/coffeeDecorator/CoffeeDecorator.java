package Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffeeDecorator;

import Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffee.Coffee;

/*
- Base Decorator for concrete decorator
- The primary purpose of this class is to define the wrapping interface for all concrete decorators.

WHy abstract?
Coffee pointless = new CoffeeDecorator(base); // Compilation error!
A raw CoffeeDecorator doesn't decorate anything—it just passes calls through. 
Marking it abstract tells the compiler and developers: "This is a blueprint for decorators, not a decorator itself."
*/

public abstract class CoffeeDecorator implements Coffee {

    protected final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
