package Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffeeDecorator;

import Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffee.Coffee;
import Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffee.Toppings;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + Toppings.SUGAR.getPrice();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + " + Toppings.SUGAR.toString();
    }

}