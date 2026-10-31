package Structural.AdapterPattern.Payments.WithAdapterPattern;

import Structural.AdapterPattern.Payments.WithAdapterPattern.processors.PaypalPaymentProcessor;
import Structural.AdapterPattern.Payments.WithAdapterPattern.processors.StripePaymentProcessor;
import Structural.AdapterPattern.Payments.WithAdapterPattern.service.PaymentService;
import Structural.AdapterPattern.Payments.WithAdapterPattern.thirdPartyGateway.Paypal;


// PaymentService → Target (expects PaymentProcessor)
// Paypal → Adaptee (incompatible existing class)
// PaypalProcessor → Adapter (bridges the two)


public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new StripePaymentProcessor());
        paymentService.checkout(100);

        paymentService = new PaymentService(new PaypalPaymentProcessor(new Paypal()));
        paymentService.checkout(200);
    }
}
