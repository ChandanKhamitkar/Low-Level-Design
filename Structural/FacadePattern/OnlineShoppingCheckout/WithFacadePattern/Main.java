package Structural.FacadePattern.OnlineShoppingCheckout.WithFacadePattern;

import Structural.FacadePattern.OnlineShoppingCheckout.WithFacadePattern.services.Cart;
import Structural.FacadePattern.OnlineShoppingCheckout.WithFacadePattern.services.Inventory;
import Structural.FacadePattern.OnlineShoppingCheckout.WithFacadePattern.services.Notification;
import Structural.FacadePattern.OnlineShoppingCheckout.WithFacadePattern.services.Payment;

public class Main {
    public static void main(String[] args) {

        CheckoutFacade checkoutFacade = new CheckoutFacade(
                new Cart(),
                new Payment(),
                new Inventory(),
                new Notification());

        checkoutFacade.checkout();
    }
}