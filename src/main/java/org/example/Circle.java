package org.example;
abstract class Shape{
    abstract double area();
}
public class Circle extends Shape {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
}
