package com.example.solidprinciplesjava.d_interface_segregation_principle.problem;

public class Cube implements IShape {
    @Override
    public double area() {
        return 10;
    }

    @Override
    public double volumen() {
        return 30;
    }
}