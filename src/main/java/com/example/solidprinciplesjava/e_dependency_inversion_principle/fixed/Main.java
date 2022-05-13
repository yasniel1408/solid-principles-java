package com.example.solidprinciplesjava.e_dependency_inversion_principle.fixed;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator iAreaCalculator = new AreaCalculator();
        IAreaCalculator iAreaCalculator2 = new AreaCalculator2();

        PrintJsonAreaCalculator jsonAreaCalculator = new PrintJsonAreaCalculator(iAreaCalculator);
        PrintJsonAreaCalculator jsonAreaCalculator2 = new PrintJsonAreaCalculator(iAreaCalculator2);

        Circle circle = new Circle(10);
        Square square = new Square(10);

        List<IShape> shapes = List.of(circle, square);

        String json = jsonAreaCalculator.json(shapes);
        String json2 = jsonAreaCalculator2.json(shapes);

        System.out.println("sum: " + json);
        System.out.println("sum2: " + json2);
    }
}
