package com.example.solidprinciplesjava.d_interface_segregation_principle.problem;

public class Rectangle implements IShape {

    @Override
    public double area() {
        return 20;
    }

    @Override
    public double volumen() {
        // no have
        return 0;
    }
}