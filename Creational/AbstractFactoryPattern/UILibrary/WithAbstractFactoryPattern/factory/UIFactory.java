package Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.factory;

import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.Button;
import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
