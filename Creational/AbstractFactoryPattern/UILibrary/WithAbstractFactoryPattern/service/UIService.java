package Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.service;

import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.factory.UIFactory;

public class UIService {

    private final UIFactory uiFactory;

    public UIService(UIFactory uiFactory) {
        this.uiFactory = uiFactory;
    }

    public void renderUI() {
        uiFactory.createButton().render();
        uiFactory.createCheckbox().render();
    }
}
