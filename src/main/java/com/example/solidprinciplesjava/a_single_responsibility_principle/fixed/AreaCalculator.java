package com.example.solidprinciplesjava.a_single_responsibility_principle.fixed;

import java.util.List;

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

}