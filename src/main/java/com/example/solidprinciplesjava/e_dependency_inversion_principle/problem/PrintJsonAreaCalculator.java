package com.example.solidprinciplesjava.e_dependency_inversion_principle.problem;

import java.util.List;

public class PrintJsonAreaCalculator {

    private AreaCalculator areaCalculator = new AreaCalculator();

    public String json(List<IShape> shapes) {
        return "{sum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<IShape> shapes) {
        return "{sum: %s}".formatted(areaCalculator.sum(shapes));
    }
}
