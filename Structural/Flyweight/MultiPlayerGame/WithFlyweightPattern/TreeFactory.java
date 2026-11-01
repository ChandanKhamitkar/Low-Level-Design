package Structural.Flyweight.MultiPlayerGame.WithFlyweightPattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class TreeFactory {

    private static final Map<String, TreeType> treeTypes = new ConcurrentHashMap<>();

    private TreeFactory() {
    }

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "_" + color + "_" + texture;

        return treeTypes.computeIfAbsent(key, k -> new TreeType(name, color, texture));
    }
}
