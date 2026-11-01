package Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern;

import Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffee.BasicCoffee;
import Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffee.Coffee;
import Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffeeDecorator.MilkDecorator;
import Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffeeDecorator.SugarDecorator;
import Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffeeDecorator.WhippedCreamDecorator;

public class Main {
    public static void main(String[] args) {

        // Basic coffee
        Coffee coffee = new BasicCoffee();
        System.out.println("Cost: " + coffee.getCost() + " Desc: " + coffee.getDescription());

        // Basic coffee + Milk
        coffee = new MilkDecorator(coffee);
        System.out.println("Cost: " + coffee.getCost() + " Desc: " + coffee.getDescription());

        // Basic coffee + Milk + SUGAR
        coffee = new SugarDecorator(coffee);
        System.out.println("Cost: " + coffee.getCost() + " Desc: " + coffee.getDescription());

        // Basic coffee + Milk + SUGAR + WHIPPED_CREAM
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println("Cost: " + coffee.getCost() + " Desc: " + coffee.getDescription());
    }
}
