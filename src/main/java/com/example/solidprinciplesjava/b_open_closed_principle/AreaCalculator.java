package com.example.solidprinciplesjava.b_open_closed_principle;

import java.util.List;

/**
 * This class does not have the open closed principle
 * because there are two ways to calculate the area and if I add another shape
 * we need to add in this function sum how calculate the area for another shape.
 *
 * To solve the problem, we need to send the responsibility for calculating
 * the area of the AreaCalculate class to each figure
 *
 * Classes should be open for extensions, closed for modification.
 * In other words, you should not have to rewrite an existing class
 * for implementing new features.
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
            if (shape instanceof Cube) {
                // ...
            }
        }
        return sum;
    }

}