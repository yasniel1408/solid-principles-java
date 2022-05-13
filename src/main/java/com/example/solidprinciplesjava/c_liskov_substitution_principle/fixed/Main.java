package com.example.solidprinciplesjava.c_liskov_substitution_principle.fixed;



public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();


        NoShape noShape = new NoShape();

    }
}
