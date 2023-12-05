package org.example;

public class CreditCardProcessor implements PaymentProcessor{
@Override
public void authorize(){
        System.out.println("Credit card authorized");
        }
@Override
public void capture(){
        System.out.println("Credit card payment captured");
        }
}