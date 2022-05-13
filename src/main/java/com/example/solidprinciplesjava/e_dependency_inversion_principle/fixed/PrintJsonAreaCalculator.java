package com.example.solidprinciplesjava.e_dependency_inversion_principle.fixed;

import java.util.List;

public class PrintJsonAreaCalculator {

    private final IAreaCalculator areaCalculator;

    public PrintJsonAreaCalculator(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<IShape> shapes) {
        return "{sum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<IShape> shapes) {
        return "{sum: %s}".formatted(areaCalculator.sum(shapes));
    }
}
