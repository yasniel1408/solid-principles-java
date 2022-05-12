package com.example.solidprinciplesjava.b_open_closed_principle;

public class Circle {
    private final int radius;

    public Circle (int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}