package Structural.DecoratorPattern.CoffeOrderingSystem.WithDecoratorPattern.coffee;

public enum Toppings {
    MILK(10),
    SUGAR(5),
    WHIPPED_CREAM(20);

    private final double price;

    Toppings(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
