package Structural.FacadePattern.OnlineShoppingCheckout.WithFacadePattern;

import Structural.FacadePattern.OnlineShoppingCheckout.WithFacadePattern.services.Cart;
import Structural.FacadePattern.OnlineShoppingCheckout.WithFacadePattern.services.Inventory;
import Structural.FacadePattern.OnlineShoppingCheckout.WithFacadePattern.services.Notification;
import Structural.FacadePattern.OnlineShoppingCheckout.WithFacadePattern.services.Payment;

public class CheckoutFacade {

    private final Cart cart;
    private final Payment payment;
    private final Inventory inventory;
    private final Notification notification;

    public CheckoutFacade(
            Cart cart,
            Payment payment,
            Inventory inventory,
            Notification notification) {

        this.cart = cart;
        this.payment = payment;
        this.inventory = inventory;
        this.notification = notification;
    }

    public void checkout() {

        cart.validateCart();

        payment.processPayment();

        inventory.updateInventory();

        notification.sendOrderConfirmation();
    }
}
