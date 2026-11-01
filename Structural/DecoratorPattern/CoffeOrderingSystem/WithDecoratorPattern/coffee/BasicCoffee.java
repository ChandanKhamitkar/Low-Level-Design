package Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffee;

/*
Now the business wants customers to add optional toppings:
- Milk: +₹10
- Sugar: +₹5
- Whipped Cream: +₹20

A customer might order:
- Basic Coffee
- Basic Coffee + Milk
- Basic Coffee + Milk + Sugar
- Basic Coffee + Milk + Sugar + Whipped Cream
*/

public class BasicCoffee implements Coffee {

    @Override
    public double getCost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }
}
