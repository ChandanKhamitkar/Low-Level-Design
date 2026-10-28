package Creational.BuilderPattern.FoodOrderingSystem.WithoutBuilderPattern;

// We can write multiple constuctors as well.
// Also Constructor telescoping
// Eventually when there are multiple fields will lead to many no.of permutation & combination of constructors

class Burger {
    String bun;
    String patty;
    Boolean cheese;
    Boolean lettuce;
    String sauce;

    public Burger(
            String bun,
            String patty) {
        this.bun = bun;
        this.patty = patty;
    }

    public Burger(
            String bun,
            String patty,
            Boolean cheese) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
    }

    public Burger(
            String bun,
            String patty,
            Boolean cheese,
            Boolean lettuce,
            String sauce) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.sauce = sauce;
    }

    // With telescoping
    // public Burger(
    // String bun,
    // String patty,
    // Boolean cheese) {
    // this(bun, patty);
    // this.cheese = cheese;
    // }

    // public Burger(
    // String bun,
    // String patty,
    // Boolean cheese,
    // Boolean lettuce,
    // String sauce) {
    // this(bun, patty, cheese);
    // this.lettuce = lettuce;
    // this.sauce = sauce;
    // }
}
