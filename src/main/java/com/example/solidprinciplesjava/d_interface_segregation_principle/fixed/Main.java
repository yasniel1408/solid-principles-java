package com.example.solidprinciplesjava.d_interface_segregation_principle.fixed;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();

        List<IShape> shapes = List.of(circle, square, cube, rectangle);

    }
}
