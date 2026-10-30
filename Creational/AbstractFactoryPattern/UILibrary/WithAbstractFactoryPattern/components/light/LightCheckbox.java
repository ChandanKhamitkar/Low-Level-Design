package Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.light;

import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.Checkbox;

public class LightCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("LightCheckbox");
    }
}
