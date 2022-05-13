package com.example.solidprinciplesjava.b_open_closed_principle.fixed;

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