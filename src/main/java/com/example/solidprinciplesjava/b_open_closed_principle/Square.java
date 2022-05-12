package com.example.solidprinciplesjava.b_open_closed_principle;

public class Square {
    private final int length;

    public Square (int length){
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}