package Structural.DecoratorPattern.CoffeOrderingSystem.WithoutDecoratorPattern;

import Structural.DecoratorPattern.CoffeOrderingSystem.WithoutDecoratorPattern.coffee.Coffee;
import Structural.DecoratorPattern.CoffeOrderingSystem.WithoutDecoratorPattern.coffee.MilkSugarCreamCoffee;

/*
The problem: Every new combination requires another class. With 10 optional toppings, 
you could have up to 1,024 combinations.

That's the problem Decorator solves.
*/

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new MilkSugarCreamCoffee();

        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());
    }
}
