package com.example.solidprinciplesjava.c_liskov_substitution_principle.problem;

import java.util.List;

public class AreaCalculator {

    public double sum (List<IShape> shapes){
        int sum = 0;
        for (IShape shape : shapes) {
                sum += shape.area();
        }
        return sum;
    }

}