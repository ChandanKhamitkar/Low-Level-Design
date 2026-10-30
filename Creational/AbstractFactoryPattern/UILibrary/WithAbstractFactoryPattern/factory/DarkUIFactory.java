package Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.factory;

import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.Button;
import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.Checkbox;
import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.dark.DarkButton;
import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.dark.DarkCheckbox;

public class DarkUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
