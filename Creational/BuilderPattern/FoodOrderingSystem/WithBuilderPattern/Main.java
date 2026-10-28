package Creational.BuilderPattern.FoodOrderingSystem.WithBuilderPattern;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.Builder("Wheat", "Veg")
                .cheese(true)
                .sauce("Mayo")
                .build();


        // Builder re-using
        Burger.Builder builder = new Burger.Builder("Wheat", "Veg");
        Burger burger1 = builder.cheese(true).build();
        Burger burger2 = builder.cheese(false).build();

    }
}
