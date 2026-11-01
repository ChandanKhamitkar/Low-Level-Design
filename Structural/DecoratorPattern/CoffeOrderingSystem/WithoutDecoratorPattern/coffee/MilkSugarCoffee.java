package Structural.DecoratorPattern.CoffeOrderingSystem.WithoutDecoratorPattern.coffee;

public class MilkSugarCoffee extends Coffee {

    @Override
    public double getCost() {
        return 65;
    }

    @Override
    public String getDescription() {
        return "Basic Coffee + Milk + Sugar";
    }
}
