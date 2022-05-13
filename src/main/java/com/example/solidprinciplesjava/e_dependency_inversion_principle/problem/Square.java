package com.example.solidprinciplesjava.e_dependency_inversion_principle.problem;

public class Square implements IShape{
    private final int length;

    public Square (int length){
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return 70;
    }
}