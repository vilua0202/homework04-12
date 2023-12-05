package org.example;

public class Dog implements AnimalSound {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}