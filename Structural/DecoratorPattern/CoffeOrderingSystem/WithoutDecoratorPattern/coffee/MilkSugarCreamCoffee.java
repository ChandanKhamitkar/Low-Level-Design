package Structural.DecoratorPattern.CoffeOrderingSystem.WithoutDecoratorPattern.coffee;

public class MilkSugarCreamCoffee extends Coffee {

    @Override
    public double getCost() {
        return 85;
    }

    @Override
    public String getDescription() {
        return "Basic Coffee + Milk + Sugar + Whipped Cream";
    }
}
