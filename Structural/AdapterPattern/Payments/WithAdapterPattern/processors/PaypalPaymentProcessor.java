package Structural.AdapterPattern.Payments.WithAdapterPattern.processors;

import Structural.AdapterPattern.Payments.WithAdapterPattern.thirdPartyGateway.Paypal;

public class PaypalPaymentProcessor implements PaymentProcessor {

    private final Paypal paypal;

    public PaypalPaymentProcessor(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pay(double amount) {
        paypal.makePayment(amount);
    }
}
