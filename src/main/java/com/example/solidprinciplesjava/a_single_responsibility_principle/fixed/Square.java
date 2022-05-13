package com.example.solidprinciplesjava.a_single_responsibility_principle.fixed;

public class Square {
    private final int length;

    public Square (int length){
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}