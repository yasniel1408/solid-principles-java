package com.example.solidprinciplesjava.c_liskov_substitution_principle.fixed;

public class Square implements IShape {
    private final int length;

    public Square (int length){
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.pow(getLength(), 2);
    }
}