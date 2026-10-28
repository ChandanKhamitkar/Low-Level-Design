package Creational.BuilderPattern.FoodOrderingSystem.WithBuilderPattern;

import java.util.Objects;

// Builder → mutable configuration.
// Burger → final, immutable product.
// build() → constructs and returns the product.


// Constructor: Best for a small number of required fields with little configuration complexity.
// Builder: Best when there are many optional fields, multiple configuration combinations, or complex validation.


// Interview rule: Introduce Builder when it solves an actual construction problem, not merely to anticipate possible future changes.


class Burger {
    private final String bun;
    private final String patty;
    private final boolean cheese;
    private final boolean lettuce;
    private final String sauce;

    Burger(Builder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.sauce = builder.sauce;
    }

    static class Builder {
        private final String bun;
        private final String patty;

        private boolean cheese;
        private boolean lettuce;
        private String sauce;

        Builder(String bun, String patty) {
            if (bun == null || bun.isBlank()) {
                throw new IllegalArgumentException("Bun is required");
            }

            if (patty == null || patty.isBlank()) {
                throw new IllegalArgumentException("Patty is required");
            }

            this.bun = bun;
            this.patty = patty;
        }

        Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        Builder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        Burger build() {
            return new Burger(this);
        }
    }
}
