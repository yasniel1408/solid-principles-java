package com.example.solidprinciplesjava.a_single_responsibility_principle.fixed;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        PrintJsonAreaCalculator jsonAreaCalculator = new PrintJsonAreaCalculator();

        Circle circle = new Circle(10);
        Square square = new Square(10);

        List<Object> shapes = List.of(circle, square);

        double sum = areaCalculator.sum(shapes);
        String json = jsonAreaCalculator.json(shapes);

        System.out.println("sum: " + sum);
        System.out.println("sum: " + json);
    }
}
