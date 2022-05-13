package com.example.solidprinciplesjava.a_single_responsibility_principle.fixed;

import java.util.List;

public class PrintJsonAreaCalculator {
    public String json(List<Object> shapes) {
        AreaCalculator areaCalculator = new AreaCalculator();
        return "{sum: %s}".formatted(areaCalculator.sum(shapes));
    }
}
