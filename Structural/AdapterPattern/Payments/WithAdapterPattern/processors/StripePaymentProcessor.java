package Structural.AdapterPattern.Payments.WithAdapterPattern.processors;

public class StripePaymentProcessor implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Stripe Payment processor");
    }
}
