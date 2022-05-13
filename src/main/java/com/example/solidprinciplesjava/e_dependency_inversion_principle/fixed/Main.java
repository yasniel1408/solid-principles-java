package com.example.solidprinciplesjava.e_dependency_inversion_principle.fixed;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator iAreaCalculator = new AreaCalculator();
        PrintJsonAreaCalculator jsonAreaCalculator = new PrintJsonAreaCalculator(iAreaCalculator);

        Circle circle = new Circle(10);
        Square square = new Square(10);

        List<IShape> shapes = List.of(circle, square);

        String json = jsonAreaCalculator.json(shapes);

        System.out.println("sum: " + json);
    }
}
