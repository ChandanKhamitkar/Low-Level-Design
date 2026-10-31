package Structural.AdapterPattern.Payments.WithAdapterPattern.thirdPartyGateway;

// Now the business wants to integrate a 3rd-party payment gateway, PayPal.
public class Paypal {
    public void makePayment(double amountInDollars) {
        System.out.println("Payment through PayPal");
    }
}
