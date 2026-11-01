package Structural.DecoratorPattern.CoffeOrderingSystem.WithoutDecoratorPattern.coffee;

public class MilkCoffee extends Coffee {

    @Override
    public double getCost() {
        return 60;
    }

    @Override
    public String getDescription() {
        return "Basic Coffee + Milk";
    }
}
