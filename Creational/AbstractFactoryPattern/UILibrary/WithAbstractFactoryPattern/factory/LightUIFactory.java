package Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.factory;

import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.Button;
import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.Checkbox;
import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.light.LightButton;
import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.light.LightCheckbox;

public class LightUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
    
}
