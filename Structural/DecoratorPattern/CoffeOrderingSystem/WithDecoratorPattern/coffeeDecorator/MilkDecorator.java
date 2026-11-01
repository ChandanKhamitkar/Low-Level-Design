package Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffeeDecorator;

import Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffee.Coffee;
import Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffee.Toppings;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + Toppings.MILK.getPrice();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + " + Toppings.MILK.toString();
    }
}