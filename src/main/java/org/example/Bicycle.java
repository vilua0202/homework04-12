package org.example;

public class Bicycle extends Vehicle {
    @Override
    void speedUp() {
        System.out.println("Bicycle is speeding up");
    }

    @Override
    void applyBrakes() {
        System.out.println("Bicycle brakes applied");
    }
}