package com.example.solidprinciplesjava.b_open_closed_principle.problem;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Circle circle = new Circle(10);
        Square square = new Square(10);

        List<Object> shapes = List.of(circle, square);

        double sum = areaCalculator.sum(shapes);

        System.out.println("sum: " + sum);
    }
}
