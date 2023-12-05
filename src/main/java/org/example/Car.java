package org.example;
abstract class Vehicle {
    abstract void speedUp();

    void applyBrakes() {
        System.out.println("Applying brakes");
    }
}
public class Car extends Vehicle {
    @Override
    void speedUp() {
        System.out.println("Car is speeding up");
    }
    @Override
    void applyBrakes() {
        System.out.println("Car brakes applied");
    }
}

