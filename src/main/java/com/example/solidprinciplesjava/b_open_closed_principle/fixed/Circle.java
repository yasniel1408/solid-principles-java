package com.example.solidprinciplesjava.b_open_closed_principle.fixed;


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