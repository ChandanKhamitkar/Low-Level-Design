package Structural.DecoratorPattern.CoffeOrderingSystem.WithoutDecoratorPattern.coffee;

public class SugarCoffee extends Coffee {

    @Override
    public double getCost() {
        return 55;
    }

    @Override
    public String getDescription() {
        return "Basic Coffee + Sugar";
    }
}
