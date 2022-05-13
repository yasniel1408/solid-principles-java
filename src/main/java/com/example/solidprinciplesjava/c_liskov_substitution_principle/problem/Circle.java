package com.example.solidprinciplesjava.c_liskov_substitution_principle.problem;


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