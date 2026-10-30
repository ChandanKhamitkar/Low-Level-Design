package Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.dark;

import Creational.AbstractFactoryPattern.UILibrary.WithAbstractFactoryPattern.components.Button;

public class DarkButton implements Button {
    
    @Override 
    public void render(){
        System.out.println("DarkButton");
    }
}