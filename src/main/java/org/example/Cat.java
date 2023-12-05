package org.example;

public class Cat implements AnimalSound {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}