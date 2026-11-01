package Structural.Flyweight.MultiPlayerGame.WithFlyweightPattern;

public class TreeType {
    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture){
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(Double X, Double Y){
        System.out.println("Drawing tree on X: " + X + " Y: " + Y);
    }
}
