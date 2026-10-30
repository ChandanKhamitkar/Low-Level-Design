package Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.light;

import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.Button;

public class LightButton implements Button {
    
    @Override 
    public void render(){
        System.out.println("LightButton");
    }
}
