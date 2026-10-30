package Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.dark;

import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.Checkbox;

public class DarkCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("DarkCheckbox");
    }
}
