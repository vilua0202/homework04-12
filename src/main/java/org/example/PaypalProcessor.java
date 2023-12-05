package org.example;

public class PaypalProcessor implements PaymentProcessor {
    @Override
    public void authorize() {
        System.out.println("Paypal authorized");
    }
    @Override
    public void capture() {
        System.out.println("Paypal payment captured");
    }
}
