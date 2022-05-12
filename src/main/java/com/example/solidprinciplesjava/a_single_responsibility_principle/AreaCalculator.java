package com.example.solidprinciplesjava.a_single_responsibility_principle;

import java.util.List;

/**
 * This class does not have the single responsibility principle
 * because there are two functionalities here.
 *
 * For fix this, we should separate the function json in other class.
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