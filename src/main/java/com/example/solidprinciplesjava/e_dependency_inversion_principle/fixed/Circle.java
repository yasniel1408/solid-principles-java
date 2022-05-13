package com.example.solidprinciplesjava.e_dependency_inversion_principle.fixed;

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
        return 40;
    }
}