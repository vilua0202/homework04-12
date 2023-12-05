package org.example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());

        AnimalSound dog = new Dog();
        AnimalSound cat = new Cat();
        dog.makeSound();
        cat.makeSound();

        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        car.speedUp();
        car.applyBrakes();
        bicycle.speedUp();
        bicycle.applyBrakes();

        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        PaymentProcessor paypalProcessor = new PaypalProcessor();
        PaymentService creditCardPaymentService = new PaymentService(creditCardProcessor);
        PaymentService paypalPaymentService = new PaymentService(paypalProcessor);
        creditCardPaymentService.processPayment();
        paypalPaymentService.processPayment();
    }
}