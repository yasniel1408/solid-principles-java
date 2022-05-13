package com.example.solidprinciplesjava.d_interface_segregation_principle.fixed;


public class Circle implements IShape {
    private final int radius;

    public Circle (int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}