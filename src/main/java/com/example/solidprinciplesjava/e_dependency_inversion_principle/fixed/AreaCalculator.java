package com.example.solidprinciplesjava.e_dependency_inversion_principle.fixed;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {

    @Override
    public double sum(List<IShape> shapes){
        int sum = 0;
        for (IShape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }

}