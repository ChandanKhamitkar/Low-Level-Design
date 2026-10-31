package Structural.AdapterPattern.Payments.WithAdapterPattern.service;

import Structural.AdapterPattern.Payments.WithAdapterPattern.processors.PaymentProcessor;

public class PaymentService {
    private final PaymentProcessor processor;

    public PaymentService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void checkout(double amount) {
        processor.pay(amount);
    }
}
