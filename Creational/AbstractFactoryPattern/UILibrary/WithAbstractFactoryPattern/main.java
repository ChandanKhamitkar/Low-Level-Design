package Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern;

import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.factory.DarkUIFactory;
import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.factory.UIFactory;
import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.service.UIService;

// Easy to add a new family (e.g., High Contrast theme): add a new factory and its components.
// Harder to add a new product type (e.g., Dropdown): modify the factory interface and its implementations.
// This is the central trade-off of Abstract Factory.

// Interview takeaway: Abstract Factory works best when product families vary frequently but the types of products within those families remain relatively stable.

public class main {
    public static void main(String[] args) {
        
        // dark theme
        UIFactory factory = new DarkUIFactory();

        UIService service = new UIService(factory);
        service.renderUI();

        // light theme
        // UIFactory factory = new LightUIFactory();

        // UIService service = new UIService(factory);
        // service.renderUI();
    }
}
