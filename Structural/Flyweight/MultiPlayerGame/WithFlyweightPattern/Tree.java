package Structural.Flyweight.MultiPlayerGame.WithFlyweightPattern;

public class Tree {
    private double X;
    private double Y;
    private TreeType type;

    public Tree(double X, double Y, TreeType type) {
        this.X = X;
        this.Y = Y;
        this.type = type;
    }

    public void draw() {
        type.draw(X, Y);
    }
}
