package org.example;

public class PaymentService {
    private PaymentProcessor paymentProcessor;
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
    public void processPayment() {
        paymentProcessor.authorize();
        paymentProcessor.capture();
    }
}
