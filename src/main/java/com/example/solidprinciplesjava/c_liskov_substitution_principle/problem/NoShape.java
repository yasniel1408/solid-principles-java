package com.example.solidprinciplesjava.c_liskov_substitution_principle.problem;

public class NoShape implements IShape {

    @Override
    public double area() {
        throw new IllegalStateException("Cannot calculate area");
    }
}
