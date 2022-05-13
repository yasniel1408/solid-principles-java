package com.example.solidprinciplesjava.d_interface_segregation_principle.fixed;

public class Cube implements IShape, IThreeDimensionalShape {
    @Override
    public double area() {
        return 10;
    }

    @Override
    public double volumen() {
        return 30;
    }
}