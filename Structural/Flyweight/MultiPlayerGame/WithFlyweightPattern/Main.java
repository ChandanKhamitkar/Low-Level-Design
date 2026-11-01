package Structural.Flyweight.MultiPlayerGame.WithFlyweightPattern;

public class Main {
    public static void main(String[] args) {
        
        TreeType oak = TreeFactory.getTreeType("Oak", "Green", "Rough");
        TreeType pine = TreeFactory.getTreeType("Pine", "Dark Green", "Smooth");
        
        Tree tree1 = new Tree(10, 20, oak);
        Tree tree2 = new Tree(30, 40, oak);
        Tree tree3 = new Tree(50, 60, pine);

        tree1.draw();
        tree2.draw();
        tree3.draw();
    }
}
