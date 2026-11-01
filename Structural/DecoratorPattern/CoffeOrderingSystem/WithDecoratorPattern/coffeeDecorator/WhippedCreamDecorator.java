package Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffeeDecorator;

import Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffee.Coffee;
import Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffee.Toppings;

public class WhippedCreamDecorator extends CoffeeDecorator {

    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + Toppings.WHIPPED_CREAM.getPrice();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + " + Toppings.WHIPPED_CREAM.toString();
    }
}