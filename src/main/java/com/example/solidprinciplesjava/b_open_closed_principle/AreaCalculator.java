package com.example.solidprinciplesjava.b_open_closed_principle;

import java.util.List;

/**
 * This class does not have the main responsibility
 * because there are two functionalities here.
 */
public class AreaCalculator {

    public double sum (List<Object> shapes){
        int sum = 0;
        for (Object shape : shapes) {
            if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            }
            if (shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
        }
        return sum;
    }

    public String json(List<Object> shapes) {
        return "{sum: %s}".formatted(sum(shapes));
    }
}